<?php
// Author: Karan Goda
$cool = ' ! awesome. . ! ';
$strr = to_nato($cool);
echo $strr;

function to_nato($words){
$key = array("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
$translationKey = array("Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot", "Golf", "Hotel", "India", "Juliet", "Kilo", "Lima", "Mike", "November", "Oscar", "Papa", "Quebec", "Romeo", "Sierra", "Tango", "Uniform", "Victor", "Whiskey", "Xray", "Yankee", "Zulu");
 $strToRet = "";
  //Loop to traverse the original string
  for($i = 0; $i < strlen($words); $i++) {
    $letter = substr($words, $i, 1);
    //If the character is a letter
    if(ctype_alpha($letter) || $letter==" ") {
      for($keySearch = 0; $keySearch < count($key); $keySearch++) {
          $letterToSearch = array_search($key[$keySearch], $key);
        if(strcasecmp($letter, $key[$letterToSearch]) == 0) {
             $natoLetter = $translationKey[$letterToSearch];
             $strToRet .= $natoLetter;
             $strToRet .= " ";
          }
        }
      }
      //If the character is a punctuation
      else {
        $strToRet .= $letter;
        $strToRet .= " ";
      }
    }
   //This will trim the whitespaces from the ends
   $strToRet = trim($strToRet, " ");
   return $strToRet;
}

?>

<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
</head>
<body>

</body>
</html>
