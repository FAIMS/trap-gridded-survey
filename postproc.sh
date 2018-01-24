#!/usr/bin/env bash

cd module

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

string="Plus=Plus"
replacement="Plus=+"
perl -0777 -i.original -pe "s/\\Q$string/$replacement/igs" english.0.properties

string="Minus=Minus"
replacement="Minus=-"
perl -0777 -i.original -pe "s/\\Q$string/$replacement/igs" english.0.properties

rm english.0.properties.original
