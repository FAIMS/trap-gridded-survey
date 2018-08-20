#!/usr/bin/env bash

cd module

# Add Select_User dropdown to search
string="
        <select1 ref=\"Entity_Types\">
          <label>\{Entity_Types}<\/label>
          <item>
            <label>Options not loaded<\/label>
            <value>Options not loaded<\/value>
          <\/item>
        <\/select1>"
replacement="
        <group ref=\"Colgroup_1\" faims_style=\"orientation\">
          <label\/>
          <group ref=\"Col_0\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Entity_Types\">
              <label>{Entity_Types}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_1\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_User\">
              <label>{Select_User}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_2\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_Date\">
              <label>{Select_Date}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
          <group ref=\"Col_3\" faims_style=\"even\">
            <label\/>
            <select1 ref=\"Select_Sample_Taken\">
              <label>{Select_Sample_Taken}<\/label>
              <item>
                <label>Options not loaded<\/label>
                <value>Options not loaded<\/value>
              <\/item>
            <\/select1>
          <\/group>
        <\/group>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

string="
              <Entity_Types\/>"
replacement="
              <Colgroup_1>
                <Col_0>
                  <Entity_Types\/>
                <\/Col_0>
                <Col_1>
                  <Select_User\/>
                <\/Col_1>
                <Col_2>
                  <Select_Date\/>
                <\/Col_2>
                <Col_3>
                  <Select_Sample_Taken\/>
                <\/Col_3>
              <\/Colgroup_1>"
perl -0777 -i.original -pe "s/$string/$replacement/igs" ui_schema.xml

string="Up=Up"
replacement="Up=▲"
perl -0777 -i.original -pe "s/\\Q$string/$replacement/igs" english.0.properties

string="Down=Down"
replacement="Down=▼"
perl -0777 -i.original -pe "s/\\Q$string/$replacement/igs" english.0.properties

string="Left=Left"
replacement="Left=◀"
perl -0777 -i.original -pe "s/\\Q$string/$replacement/igs" english.0.properties

string="Right=Right"
replacement="Right=▶"
perl -0777 -i.original -pe "s/\\Q$string/$replacement/igs" english.0.properties

cat << EOF >> english.0.properties
Select_User=Select User
Select_Date=Select Date
Select_Sample_Taken=Select Sample Taken
EOF

rm english.0.properties.original
rm ui_schema.xml.original
