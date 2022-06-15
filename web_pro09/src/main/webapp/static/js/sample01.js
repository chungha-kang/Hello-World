/**
 * 
 */
 
//var arr1 = [1, 2, 3];
var arr1 = new Array(1, 2, 3);
var res1 = document.getElementById("res1");
res1.innerHTML += arr1 + "<br>";
res1.innerHTML += "arr1[0] -> " + arr1[0] + "<br>";
res1.innerHTML += "arr1[1] -> " + arr1[1] + "<br>";
res1.innerHTML += "arr1[2] -> " + arr1[2] + "<br>";

arr1[0] = 10;
arr1[1] = 20;
arr1[2] = 30;
res1.innerHTML += arr1 + "<br>"

res1.innerHTML += "arr1.indexOf(10) -> " + arr1.indexOf(10) + "<br>";
res1.innerHTML += "arr1.indexOf(20) -> " + arr1.indexOf(20) + "<br>";
res1.innerHTML += "arr1.indexOf(30) -> " + arr1.indexOf(30) + "<br>";

res1.innerHTML += "arr1.push(40)" + "<br>";
arr1.push(40);
res1.innerHTML += "arr1.push(50)" + "<br>";
arr1.push(50);
res1.innerHTML += "arr1.push('60')" + "<br>";
arr1.push("60");
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.unshift(0)" + "<br>";
arr1.unshift(0);
res1.innerHTML += arr1 + "<br><br>";

// pop = 뒤에 내용 삭제 및 반환
res1.innerHTML += "arr1.pop()" + "<br>";
arr1.pop();
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.shift()" + "<br>";
arr1.shift();
res1.innerHTML += arr1 + "<br><br>";

// reverse = 뒤집기
res1.innerHTML += "arr1.reverse()" + "<br>";
arr1.reverse();
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.sort()" + "<br>";
arr1.sort();
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.slice()" + "<br>";
arr1.slice(0, 3);
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.concat()" + "<br>";
arr1.concat('a', 'b', 'c');
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.splice()" + "<br>";
arr1.splice(0, 0, 50, 60, 70);
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.splice()" + "<br>";
arr1.splice(6, "A", "B", "C", "D");
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.toString()" + "<br>";
arr1.toString();
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.slice()" + "<br>";
arr1 = arr1.slice(0, 6)
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.sort()" + "<br>";
arr1.sort(function(x, y) { return y - x; });
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.sort()" + "<br>";
arr1.sort();
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.reverse()" + "<br>";
arr1.reverse();
res1.innerHTML += arr1 + "<br><br>";


'a' - 'b';
// NaN

'a'.codePointAt();
// 97

'b'.codePointAt();
// 98

'a'.codePointAt() - 'b'.codePointAt();
// -1


res1.innerHTML += "arr1.join(,)" + "<br>";
arr1.join(',');
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.join(, )" + "<br>";
arr1.join(', ');
res1.innerHTML += arr1 + "<br><br>";

res1.innerHTML += "arr1.join(-)" + "<br>";
arr1.join('-');
res1.innerHTML += arr1 + "<br><br>";


/**
var id_input1 = new Array('a', 'b', 'c', 'd', 'e');
var exam1 = document.getElementById("exam1");
exam1.innerHTML += "[" + id_input1.join(', ') + "]" + "<br>";


var id_input2 = new Array(10, 20, 30, 40);
var exam2 = document.getElementById("exam2");
exam2.innerHTML += "[" + id_input2.join(', ') + "]" + "<br>";

id_input2.push(10 + 20 + 30 + 40);
exam2.innerHTML += "[" + id_input2.join(', ') + "]" + "<br>";
*/


/**
 * 다음의 input 요소에 있는 값을 배열로 만들어 exam1 에 출력<br>
 * 출력 형식은 ['a', 'b', 'c', 'd', 'e'] 와 같이 대괄호 안에 값이 출력되도록 한다.
 */
var arr2;
var input1 = document.getElementById("id_input1");
var exam1 = document.getElementById("exam1");
arr2 = input1.value.split(",");

for(var i = 0; i < arr2.length; i++) {
	arr2[i] = arr2[i].trim();
}

exam1.innerHTML = "['" + arr2.join("', '") + "']";

/**
 * 다음의 input 요소에 있는 값을 문제 1에서 만든 배열에 추가 후 출력<br>
 * 출력 형식은 문제 1과 동일하다.<br>
 * 추가로 input 요소에 있는 값의 총 합을 구하여 배열에 추가도 한다.
 */
var input2 = document.getElementById("id_input2");
var exam2 = document.getElementById("exam2");
var tmp = input2.value.split(",");
var total = 0;

for(let item of tmp) {
	item = parseInt(item);
	total += item;
	arr2.push(item);
}
arr2.push(total);

exam2.innerHTML = "['" + arr2.join("', '") + "']";