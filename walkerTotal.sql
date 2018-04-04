-- christian [6:40 PM]
-- I want a query which, for each child of an ent with a given uuid, 
-- computes the sums of all the children's fields, as well as the totals of those sums.

-- Take the following as an example. 
-- I have an archent of type 'Survey Unit' which has two children of type 'Walker Unit'. 
-- Each Walker Unit has a field called 'Ancient'. The first Walker Unit has '1' in this field, where as the second as '41'. 
-- There's also a 'Modern' field for which each Walker Unit has a '2' and a '5', respectively. For this example, I want the query to output something like:

-- ```Ancient | 42
-- Modern | 7
-- Total | 49```

-- In reality there's not just 'Ancient' and 'Modern'-
-- There's 6 more fields. But I assume it'll be simple to expand the query for that. Also, if it's easier, the columns and rows of the output can be transposed so that instead of the above, the query yields the following:

-- ```Ancient | Modern | Total
-- 42 | 7 | 49```

-- It might be helpful to know a couple of Survey Unit (i.e. parent) UUIDs from the database:

-- ```1000011522742385923
-- 1000011522743664435```


drop table if exists materialisedWalker;

create table materialisedWalker as

select uuid, attributename, vocabid, measure
  from latestnondeletedarchent
  join latestnondeletedaentvalue using (uuid)
  join attributekey using (attributeid)
  where attributename in ('Walker Number', 'Row Number', 'N A', 'Ancient','Modern','A C', 'HM', 'Lithic','Daub', 'Glass', 'Other');

select measure, attributename from latestnondeletedaentvalue join attributekey using (attributeid) where uuid = 1000011522742385923;
select * from parentchild where parentuuid = 1000011522742385923;

select attributename from attributekey
join idealaent using (attributeid) join aenttype using (aenttypeid) where aenttypename = 'Walker Unit';
    
select sum(AncientMeasure), sum(ModernMeasure), sum(ACMeasure), sum(HMMeasure),sum(LithicMeasure), sum(DaubMeasure), sum(GlassMeasure), sum(OtherMeasure), sum(AncientMeasure) + sum(ModernMeasure) + sum(ACMeasure) + sum(HMMeasure) +sum(LithicMeasure) + sum(DaubMeasure) + sum(GlassMeasure) + sum(OtherMeasure)

  from (select *, childuuid as uuid from parentchild) as pc
left outer join (select uuid, sum(measure) as AncientMeasure
          from materialisedWalker
         where attributename in ('Ancient')
         group by uuid
        ) as AncientMeasure using (uuid)
left outer join (select uuid, sum(measure) as ModernMeasure
          from materialisedWalker
         where attributename in ('Modern')
         group by uuid
        ) as ModernMeasure using (uuid) 
left outer join (select uuid, sum(measure) as ACMeasure
          from materialisedWalker
         where attributename in ('A C')
         group by uuid
        ) as ACMeasure using (uuid)
left outer join (select uuid, sum(measure) as HMMeasure
          from materialisedWalker
         where attributename in ('HM')
         group by uuid
        ) as HMMeasure using (uuid)
left outer join (select uuid, sum(measure) as LithicMeasure
          from materialisedWalker
         where attributename in ('Lithic')
         group by uuid
        ) as LithicMeasure using (uuid)
left outer join (select uuid, sum(measure) as DaubMeasure
          from materialisedWalker
         where attributename in ('Daub')
         group by uuid
        ) as DaubMeasure using (uuid)
left outer join (select uuid, sum(measure) as GlassMeasure
          from materialisedWalker
         where attributename in ('Glass')
         group by uuid
        ) as GlassMeasure using (uuid)
left outer join (select uuid, sum(measure) as OtherMeasure
          from materialisedWalker
         where attributename in ('Other')
         group by uuid
        ) as OtherMeasure using (uuid)
  left outer join (select uuid, vocabid is not null as na
          from materialisedWalker
         where attributename in ('N A')
        ) as naVocab using (uuid)      
  join (select uuid, measure as walkerID
      from materialisedWalker
      where attributename = 'Walker Number') USING (uuid)
  join (select uuid, measure as rowID
      from materialisedWalker
      where attributename = 'Row Number') USING (uuid)
  where parentuuid = 1000011522742385923
  and na is null
  order by rowID, walkerID;

    
select walkerID, rowid, na, (AncientMeasure), (ModernMeasure), (ACMeasure), (HMMeasure),(LithicMeasure), (DaubMeasure), (GlassMeasure), (OtherMeasure)

  from (select *, childuuid as uuid from parentchild) as pc
left outer join (select uuid, sum(measure) as AncientMeasure
          from materialisedWalker
         where attributename in ('Ancient')
         group by uuid
        ) as AncientMeasure using (uuid)
left outer join (select uuid, sum(measure) as ModernMeasure
          from materialisedWalker
         where attributename in ('Modern')
         group by uuid
        ) as ModernMeasure using (uuid) 
left outer join (select uuid, sum(measure) as ACMeasure
          from materialisedWalker
         where attributename in ('A C')
         group by uuid
        ) as ACMeasure using (uuid)
left outer join (select uuid, sum(measure) as HMMeasure
          from materialisedWalker
         where attributename in ('HM')
         group by uuid
        ) as HMMeasure using (uuid)
left outer join (select uuid, sum(measure) as LithicMeasure
          from materialisedWalker
         where attributename in ('Lithic')
         group by uuid
        ) as LithicMeasure using (uuid)
left outer join (select uuid, sum(measure) as DaubMeasure
          from materialisedWalker
         where attributename in ('Daub')
         group by uuid
        ) as DaubMeasure using (uuid)
left outer join (select uuid, sum(measure) as GlassMeasure
          from materialisedWalker
         where attributename in ('Glass')
         group by uuid
        ) as GlassMeasure using (uuid)
left outer join (select uuid, sum(measure) as OtherMeasure
          from materialisedWalker
         where attributename in ('Other')
         group by uuid
        ) as OtherMeasure using (uuid)
  
  


  left outer join (select uuid, vocabid is not null as na
          from materialisedWalker
         where attributename in ('N A')
        ) as naVocab using (uuid)      
  join (select uuid, measure as walkerID
      from materialisedWalker
      where attributename = 'Walker Number') USING (uuid)
  join (select uuid, measure as rowID
      from materialisedWalker
      where attributename = 'Row Number') USING (uuid)
  where parentuuid = 1000011522742385923
    and na is null
  order by rowID, walkerID;