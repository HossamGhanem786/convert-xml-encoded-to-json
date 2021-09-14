# convert-xml-encoded-to-json

this project used to convert encoded 64 xml object to json object

for Ex:
input before encode= 
<?xml version="1.0" encoding="UTF-8"?>
            <name>Hossam</name>
            <age>29</age>
===================================================================================
input >>>>> encodedObject=PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiPz4KICAgICAgICAgICAgPG5hbWU+SG9zc2FtPC9uYW1lPgogICAgICAgICAgICA8YWdlPjI5PC9hZ2U+CiAgICAgICAgIA==
output >>>>>jsonObject=
{
    "name": "Hossam",
    "age": 29
}
