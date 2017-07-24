<?php
// Author: Karan Goda
// https://www.codewars.com/kata/514b92a657cdc65150000006
function solution($number) { $sum = 0;
  for($i = 0; $i < $number; $i++) {
	  if(($i % 3) == 0 || ($i % 5) == 0) {
		  $sum = $sum + $i;
	   }
	}
	return $sum;
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
