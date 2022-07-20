# 자바 스크립트
자바스크립트 -> Document Object -> Window Object

## 데이터
### 자바 스크립트의 탄생
전송하는 데이터에 대한 유효성 검사가 필요.
폼객체가 메모리상에 올라가면 자바스크립트를 통해 유효성 검사가능.

### 스크립트 코드 작성 영역
```html
  <script>
    스크립트 코드
  </script>
```
- head, body영역 상관없이 삽입이 가능하다.
- `console.log();`로 콘솔창에 출력 
- `alert();`으로 인터넷 알림창을 띄울 수 있다.
### 변수 선언 `var`
- var 키워드를 사용해서 선언해준다.
- ex) `var x = 3;`
- 레퍼런스 변수는 단순 이름(공간이 없다.)
- 참조 변수는 객체의 주소를 담고있다.
  1. 부울 - Boolean
  2. 정수 - Number
  3. 실수 - Number
  4. 문자 - String
  5. 문자열 - String  
- `var x = 3`은 사실 `var x = new Number(3);`과 같다.    
  - 생략해도 사용할 수 있는 이유는 오토박싱때문이다.  
  - 동적으로 변수의 데이터형이 변한다.  
- `var x;`와 같이 초기화를 하지않으면 `undefined`라고 한다.(다른 언어에서는 Null과 같음)
  - 문자열이 아닌 undefined 그 자체다.(!= 'undefined')
- `typeof x`로 타입을 확인 할 수 있다

### 배열 `Array` (선형)
- `new Array();`로 선언
  - `new Array(2);`와 같이 방의 개수를 지정할 수 있다.
  - `new Array(2, 3);`와 같이 두개 이상을 넣으면 값을 지정해서 넣는 것이다.
  - `new Array(2, 3, "hello");`와 같이 여러 데이터 형식을 넣을 수 있다.
  - `new Array(2, 3, "hello", new Array(2,3,4));`와 같이 배열안에 배열을 담을 수 있다.
- `Array.length()`로 배열의 길이를 확인할 수 있다.
- 데이터 접근 방법
  1. `Array.push();`, `Array.pop();`을 통해 스택처럼 사용 가능
  2. `Array[index]` index로 꺼낼수 있다.
     - index는 0부터 시작한다.
  3. `Array.splice(start, length, insert)` start부터 length개 만큼 삭제후 insert를 삽입한다.
     ````html
     list = new Array(1, 2, 3, 4);
     list.splice(1, 3, 23);
     ```` 
     => [1, 23]

### 오브젝트 `Object` (해쉬형)
- javascript는 다른 언어와 다르게 객체를 만들고 정의를 한다.
  - prototype | class
  - 이를 동적인 객체 생성이라고 한다.
- `new Object();`로 생성.
- 키를 이용해서 데이터 관리를 한다. 
  1. `object["key"] = value;`(=list형)
  2. `object.key = value;` 해당 방법을 기본으로 사용한다.(=Map형)
- 사용 예시
```html
var exam = new Object();
exam.kor = 30;
exam.eng = 70;
exam.math = 80;
```


### JSON 데이터
1. Boolean: `var n = true;`
2. Number: `var n = 3`
3. String: `var s = "hello" or 'hello';`
4. Array: `var ar = [];`
5. Object: `var ob = {};`
- 중첩 표현
```html
var data = [
  {"id": 1, "title":"hello json"},
  {"id": 2, "title":"hi json"},
  {"id": 3, "title":"json is ..."}
]
```
- 위와 같이 중첩해서 사용 가능하다.

> 하나의 문자열을 줄바꿈 해서 쓰는 방법ㅣ '\'를 써준다

### eval();
API를 통해 Json데이터를 받아오면 문자열로 이루어져 있기때문에 JSON으로 변환을 해주어야 한다.
따라서 eval()로 변환을 해주어야 한다.
ex) `eval("var ar = " + data + ";");`
- eval()이라는 함수는 문자열 안을 그대로 코드로 변경해주는 기능이다.
- 하지만 해당 방법은 해킹의 위험이 있으므로 사용을 지양하자.

### JSON.parse();
- JSON으로 파싱해주는 함수
- 주의사항은 KEY값은 항상 String으로 표현해주어야 한다.("String")

### JSON.stringify();
- JSON을 문자열로 변경해주는 함수.


## 연산자
### 산술 연산자: +, -, *, /, %

### 비교 연산자: <. >, <=, >=, ==, !=, ===, !==
- ===, !== 연산자는 변수의 공간 자체를 비교하는 연산자.(주소 비교)
- 상수(숫자)형은 new 키워드로 새로 만들어주지 않으면 원래 사용했던 래터럴변수를 그대로 사용한다. 

### 관계 연산자: %%, ||
- 3 + "4" = 34
- 3.5 + "4" = 3.54
- 3.5 - "2" = 1.5
- 3 < "4" = true

## 제어구조
### 조건문
- if, while, do-while

### 반복문
- while, for, for-in
ex)
```html
<script>
  var ar = ["hello", "hi", "greeting"];
  //for(var i=0; i<3; i++)
  for(var i in ar)
    document.write(ar[i]+"<br />");
  
</script>
```
- for-in은 값이 아닌 Index(Key)를 꺼내준다.
- 그외 많은 레퍼런스는 "MDN javascript"를 검색하면 확인가능.


## 함수
### 함수 표현식
1. var name = new function("parameter", "code;");
2. var name = function(parameter){ code; }
3. function name(parameter){ code; }

### 함수 매개변수 콜렉션
- 자바스크립트는 매개변수의 개수가 다르다고 오류가 발생하지 않는다.
- 내부적으로 arguments라는 변수에 전부 담고 필요한 변수를 꺼내서 사용한다.
- 만약 매개변수가 부족하다면 Null의 의미인 NaN를 반환한다.

### 변수의 가시영역, global 객체 그리고 전역변수
```html
<script>
  alert(a);
  var a = 1;
</script>
```
출력: undefined
- 스크립트를 출력하기전에 전부 변수를 선언만 해서 준비를 해놓는다.
- 이를 가시영역이라고 한다.
```html
<script>
  a = 1;
  alert(a);
</script>
```
- 위와 같이 초기화를 한다면 전역 변수로 window객체에 생성이 된다.
- 즉, `window.a = 1;`과 같다.

```html
<script>
  alert(a);
  a = 1;
</script>
```
- 해당 모습 처럼 변경을 하게 된다면 웹페이지 오류가 발생하게 된다.
- 전역 변수와 지역 변수를 사용하게 되면 지역 변수를 사용한다.
- 변수를 두 번이상 선언하게 되더라도 오류가 발생하지 않는다.
- 중괄호가 변수 영역을 나누지 않는다.
- 유일하게 함수내에서만 지역변수가 사용된다.

### 클로저
- f1함수의 return에 f2 함수를 반환할떄 f2함수의 내부 안에 f1의 지역변수를 사용하는 경우
- f1의 생명주기는 f2가 끝날때 같이 끝나게 된다
- 따라서 f2를 클로저라고 칭한다.

## 브라우저 플랫폼(Browser Object)
### 브라우저 객체
- 브라우저의 틀을 사용할 수 있다.(브라우저 닫기, 사이즈 조절, 새로 열기 등)
- window 속성
  - `window.location`: 사이트 이동(주소창)
  - `window.history`: 이전 주소(뒤로가기, 앞으로 가기)
  - `window.documnet`: HTML요소 다루기(body, img, form, input 등등)
  - `navigator`
- window 함수 (window. 생략)
  - `alert()`: 안내 메시지
  - `confirm()`: 확인창
  - `prompt()`: 값 이력 대화창
    - `var name = prompt("String", default);`
    - string: 표시할 메시지
    - default: 초기 입력값
    - 입력받은 내용은 문자열로 저장이 된다.
    - 따라서 `parseInt()`로 변환해주어야 한다.  
      (해당 경우에 숫자가 아닌 값을 넣으면 NaN 반환)
      (또한 parseInt는 문자열내부 Int값만 가져온다.)
  - setTimeout()
  - clearTimeout()
  - setInterval()
  - clearInterval()
- window 프로퍼티
  - status
  - defaultStatus

## 스크립트 코드 작성 영역
1. `<script></script>`: 페이지가 읽혀 질 때 사용
2. `<input onXXX= " "/>`: 이벤트가 발생 할 때 실행.
ex)
```html
<body>
  <input type="button" value="출력"
    onclick="alert('안내 메시지');" />
</body>
```
- 해당 코드는 button을 클릭하기 전까지 실행되지 않는다.
- 긴 코드는 script블럭에 함수로 정의해놓고 클릭시 함수를 동작시킨다.

## 엘리먼트 객체 이용하기
- html요소에 id를 부여한뒤 요소를 동적으로 변화시킬 수 있다.
- `id.value`: 값
- `id.innerText`: HTML 표시할 텍스트
  - `.textContent`로도 사용 가능하다.
- `id.type`: 속성
- 스크립트 블럭내에 onXXX으로 넣을때에는 ()를 뺸다.
- 스크립트 블럭내에 onXXX으로 넣을때에는 해당 요소 이후에 삽입해야한다.
  - 또 다른 방법은 onXXX를 또다른 함수로 감싼뒤
  - `window.onload = init`을 삽입해 페이지 로드 후에 함수를 실행시킨다.
- HTML의 명명 규칙은 단어 사이에 '-'를 삽입하는 것이 규칙.
  - 자바 스크립트는 카멜명명법이 규칙이다.
  - 따라서 `document.getElementById("html이름");`으로 사용한다.
    - 전역변수에 쓰는 일은 바람직하지 않다.

## 익명 함수
```html
<scrip>
  window.onload = function(){
    var btnPrint = document.getElemnetById("btn-print");
  
    var add = function(x, y){
      return x + y;
  };
</scrip>
```

### View, Controller 물리적으로 나누기
```html
<script src="path" type="text/javascript"></script>
```
- 해당 방법으로 자바스크립트 코드를 외부로 둘 수 있다.
- 블록 태그이므로 단일 태그처럼 사용할 수 없다.
- 해당 방법으로 재사용과 유지보수등 많은 이점이 생긴다.

#### 여러 스크립트 파일을 함께 사용할 떄 초기화 함수의 문제.
- `window.onload = function(){ code; }`
-  위의 코드를 사용한다면 여러 스크립트 파일을 불러올때 init함수가 덮어써진다.
- `window.addEventListener("load", function(){ code; }`
-  따라서 해당 코드를 사용해서 초기화가 아닌 추가를 해준다.

### 하위 엘리먼트 선택
- `.getElementsByTagName();`: 태그 이름으로 찾기
- `.getElementsByClassName();`: 클래스 이름으로 찾기
  - 배열로 반환되기 떄문에 값이 1개일 경우 `[0]`을 붙여준다.

## Selectors API
### Selectors API Level 1
- `querySelector("selector");`
- `querySelectorAll("selector");`
- css 선택자를 사용해서 뽑아올 수 있다.
- `tag.children[index];` 셀렉터API로 태그의 하위 태그들을 뽑아 리스트로 사용.ㅌ