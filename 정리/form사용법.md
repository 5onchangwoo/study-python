#인라인 블록 태그

### `<form></form>`
+ 폼 형식 지정.
+ `action=""`: 폼에서 액션(버튼을 누르는 등)을 행할 경우 해당 url전송
+ `method=""`: 폼은 post, get 방식중 선택가능

### `<fieldset></fieldset>`
+ 사각 울타리로 감싸줌.
+ 그룹으로 묶어줌.

### <legend></legend>`
+ fieldset안에서만 사용가능.
+ 그룹(울타리)에 이름을 표시

### `<label></label>`
+ 말 그대로 라벨을 부착하는 기능.
+ for 속성을 통해 input 박스의 id값을 넣어 해당 input태그에 라벨을 지정할 수 있다.

### `<input>`
+ 다양한 입력 도구
+ `type=""`: 로 입력 형식을 선택할 수 있음 (기본은 "text")
    + `text`: 텍스트(기본)
    + `date`: 날짜
      + 브라우저마다 모양이 다름.
    + `color`: 색상
    + `range`: 범위
      + 예)`<input type= "range min="0" max="100" value="30"> `
    + ```summit```: 전송
    + `autofocus`: 페이지 로딩시 자동으로 선택될 항목(페이지당 한개)
    + `autocomplete`: 자동완성(기본은 ON)/OFF
    + `list="name"`: 데이터 자동완성 리스트 제공(강요X), datalist의 이름을 넣으면 된다.
      + `datalist id="name"`: datalist 지정
        + `<option value="">`: datalist 옵션
    + 전송을 하게되면 name 값이 key 값이 되고 value값이 value값으로 전송이 된다.

  
+ `radio`
  + `id=` 프론트엔드에서 해당 개체를 인식하기 위한 id
  + `name= `서버에서 인식할 이름, 하나의 그룹은 같은 이름을 갖는다.
  + `value=` 해당 버튼이 선택됐을때 전송될 값.
+ `required`: 해당 입력을 필수적으로 입력해야 하게 만듦.
+ `min, max`: 범위 지정(가능한 경우)
+ `placeholder`: 입력이 비어있을 경우 표시할 내용

### `<button>`
+ `<input type=submit>`의 기능과 동일
+ 하지만 button은 이미지 삽입등 추가적으로 기능을 추가할 수 있다.
+ 즉, 모양을 꾸밀 수 있다.

### `output`
+ input에 대한 결과

### `select`
+ 콤보박스와 같이 여러개의 목록중 한개를 선택하는 방식
+ name= 지정 시 파라미터로 전달
+ `<option></option>` 와 함께 사용
  + `value=""`로 선택시 전송할 파라미터 값 지정 가능.
+ `<select multiple>`지정시 여러개 동시 선택 가능.
