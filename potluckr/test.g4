//Grammar
//Lexer rules start with Upper case letter, parser rules start with lower case letter
/*todo: maybe output all the availability / person / recipe info as separate .txt files, but main .csv file should
include the basic schedule info. unsure whether to dynamically assess date / start time or hardcode
idea is to separate two main paths, SCHEDULE(solidify the csv) AND PLAN(person + food)
note, { java code in here } i.e. in brackets */

//note, to handle OPTIONALS "?", syntax: if ($BLAH.text != null...)

grammar test;
//global declarations
//@members{
//StringBuilder strTest = new StringBuilder();
//}
prog : start+ EOF;
//option to set private for google csv output
//format is : schedule{$value = $schedule.value;}
//plan($value = #$plan.value)
//all string returns
start : (schedule | plan);
schedule: PRIVATE? EVENT '{' event '}';
//time mandatory, any combo of name, details, and place but only one
//might need a separate rule for unknown date

//Event scheduler
event : name date (time? place? description? | time? description? place? | place? time? description? |
        place? description? time? | description? place? time? | description? time? place?)?
      ;
name : NAME '{'DESC'}';
//whitespace change
description : DESCRIPTION '{'DESC(DESC|SPACE)*'}';
place : PLACE '{'DESC'}';
time : FROM '{' TIME TO TIME '}';
date : DATE '{' MONTH DAY YEAR '}';

//Plan branch, goes to attendee(schedule who's free/diet restrictions) or recipe(create dish)
//both output to a .txt
plan
    : PLAN '{' (attendee | recipe) '}'

    ;
//if last entry, don't end in comma
attendee : ATTENDEE '{' name allergy? diet? cuisine? available? unavailable? '}';
allergy: ALLERGY '{' (ALLERGIES ',' | ALLERGIES)+ '}';
diet : DIET '{' DIETTYPE '}';
cuisine: CUISINE '{' CUISINES '}';
available : AVAILABLE '{' (MONTH DAY FROM TIME TO TIME)* '}';
unavailable : UNAVAILABLE '{' (MONTH DAY FROM TIME TO TIME)* '}';

//Plan for Recipe, basic 'what's in your fridge'
//bold comma play in the DESC here, might make things a bit challenging
//strip away , in the backend
//figure out how to "pass" this value up to the top
recipe returns [ArrayList<String> strTest]
@init{
    $strTest = new ArrayList<String>();
}
    : a = RECIPE{$strTest.add($a.text);} '{' (f=DESC ',' {$strTest.add($f.text);} | g=DESC {$strTest.add($g.text);})* '}'
     {System.out.println($strTest);}
    ;




//SCANNER
ALLERGIES : 'Dairy' | 'Eggs' | 'Gluten' | 'Grains' | 'Peanuts' | 'Seafood' | 'Sesame' | 'Shellfish' | 'Soy' |
        'Sulfite' | 'Tree Nuts' | 'Wheat';
DIETTYPE : 'Ketogenic' | 'Paleo' | 'Vegan' | 'Primal' | 'Vegetarian' | 'Gluten Free';
MONTH : 'january' | 'february' | 'march' | 'april' | 'may' | 'june' | 'july' | 'august' | 'september' | 'october';
CUISINES : 'African' | 'American' | 'British' | 'Cajun' | 'Caribbean'| 'Chinese' | 'French' | 'German'
        | 'Greek' | 'Indian' | 'Italian' | 'Japanese' | 'Jewish' | 'Korean' | 'Latin American'| 'Mexican' | 'Middle Eastern'
        | 'Southern'  | 'Thai' | 'Vietnamese';
CUISINE : 'cuisine';
DIET : 'diet';
ALLERGY : 'allergy';
PRIVATE : 'private';
EVENT : 'event';
NAME : 'name';
PLAN : 'plan';
DESCRIPTION : 'description';
PLACE : 'place';
FROM : 'from';
TO : 'to';
DATE : 'date';
RECIPE : 'recipe';
ATTENDEE: 'attendee';
UNAVAILABLE : 'unavailable';
AVAILABLE : 'available';
DAY : [1-9][0-9]|[1-9];
//add colon in middle if you wish for "24 hour military time"
TIME : [0-2][0-9]':'[0-5][0-9];
YEAR : [2][0][1-9][0-9];
//good until the year 2099
DESC : [a-zA-Z0-9]+;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
SPACE : [ ]+;

