# CSS (Cascading Style Sheets)

* Cascading(계단형) -> 계속 스타일을 덮어서 입혀나갈 수 있다는 것을 의미함.(우선 순위에 따름)
* 스타일 입히는 방법
  style=""로 시작
  color, font-size(px단위) 등등
  예) `<h1 style="color:blue;font-size:5px;"> 메인메뉴 </h1>`
* 우선 순위


  2. 범위가 좁을 수록 우선순위가 높음.
  3. 동일한 연산 순위일 경우 나중에 작성한 것이 우선순위가 높음.
  4. 기본 선택자 중에서는 id -> class -> tag (id가 가장 높음)
  5. 복합 연산자는 기본 선택자보다 높음.
  6. 속성선택자([attr=value])는 클래스선택자(.classname)와 우선순위가 같음.
  7. 적용 방식에 따라 Inline -> Internal = External (Inline만 높음)


* HTML에 CSS를 적용하는 방법

  1. Inline styles
     태그 자체에 삽입 하는 방법.

  ```html
  <p style="color:red;">
  ```

  2. Internal stylesheet
     같은 페이지 안에 style블록으로 삽입.

  ```html
  <style>
    p{
        color: red;
    }
  </style>
  ```

  3. External stylesheet
     외부 파일로 style 파일으로 삽입.

  ```html
  <link rel="stylesheet" href="css/index.css" type="text/css">
  ```

  `@import url(style.css);`로 추가적인 css파일을 import할 수 있지만 속도가 느려질 수 있음.
  그러므로 lv을 1~2정도만 사용하는 것을 추천.
  또한 import한것이 후에 적용 됨(우선순위가 더 높아짐)

## 선택자 (Selectors)

h1 태그에 스타일을 부여하는 등. 그룹단위로 묶어서 스타일을 부여할 수 있게 해줌.
사용법: 스타일 블록을 따로 지정해둔후 사용할 그룹을 괄호 앞에 그룹 이름을 지정.

```html
<style>
h1
{
  color:blue;
}
```

### Basic (기본 선택자)

* Type selectors (타입)
* Class selectors (클래스)
* ID selectors (아이디)
* ~~Universal selectors~~
* ~~Attribute selectors~~
* `aside.h1 -> aside class="h1"`
  태그명.클래스명 (태그 생략시 *이 기본 -> 모든 태그)
* `#a -> id = "a"`
  &amp;아이디명 - 아이디는 한개 뿐이므로 한개만 찝어서 css를 입힐때 사용.

> **참고**
> id vs class
> id는 HTML을 작성하는 사람이 명명
> class는 css를 작성하는 사람이 명명
> id는 html을 작성할때 사용되는 경우가 많기 때문에 css를 지정하는 사람이 마음대로 id를 바꾸면 오류가 발생할 수 있음

### Attributes (속성 선택자)

* `h1[class]`
  태그명[속성명] -> 해당 속성을 가지고있는 태그를 선택.
  h1태그 중에 class를 가지고있는 태그를 선택. 클래스의 내용은 상관 없음.
* 연산자 사용법
  [attr=value]: 해당 value를 가지고있는 attr 선택
  [attr~=value]: 해당 value을 포함한 attr 선택
  [attr|=value]: 해당 value를 부분문자열로 포함하고있는 attr 선택
  [attr^=value]: 해당 value으로 시작하는 attr 선택
  [attr$=value]: 해당 value으로 끝나는 attr 선택
  [attr*=value]: 해당 value의 일부가 포함되어있는 attr 선택
  [attr operator value i]: 대소문자를 구별하지 않겠다.(모든 연산자에 대한 옵션)
  주의
  [attr~=value], [attr|=value], [attr*=value] 구분
  ~=: value 값이 완벽하게 일치해야함.
  |=: value 값이 전부 포함되야 함.
  *=: value 값의 일부가 들어있어도 선택.
* ex)
  `<a href="example">`
  `<a href="exam">`
  `<a href="exampleSite>`
  세개의 태그가 있을 때
  [href~=example] -> example 선택
  [href|=example] -> example,exampleSite 선택
  [href*=example] -> example, exam, exampleSite 선택

### Combinator (콤비네이션 연산자)

* Descendant selectors (자손 선택자)
  `A B` (공백문자): A의 자손 중에서 B를 찾아라. (자식 포함)
* Child selectors (자식 연산자)
  `A>B`: A의 자식 중에서 B를 찾아라.
* Adjacent sibling selector
  `A+B`: 바로 밑 동생이 B인 A를 찾아라.
* General sibling selector
  `A~B`: 동생중 B를 포함하고있는 A를 찾아라

### Pseudo class

### Pseudo element

## Attributes

### 텍스트 관련 설정

* font: 폰트의 기본 사이즈는 16px
* color
* size
* content
* text
* filter
* mask

### 박스 관련 설정

* border
* background
* overflow
* margin
* padding
* shape

### 애니메이션 관련 설정

* animation
* transform

### 레이아웃 관련 설정

* flexbox
* Float
* grid
* positioning
* column
* place

### 값 관련 설정

* contrast()
* counters()
* max()
* min()
* matrix()
* image-set()
* minmax()
* url()

## Responsive

* Media query

## CSS에서의 색상 지정
1. Color Keywords
   - 색상의 키워드로 지정할 수 있음
   - 간편하지만 섬세하게 설정 불가능.
2. Hex
   - RGB 색상체계로 색을 표현할 수 있음.
   - `#c0c0c0` (두글자씩 사용.)
     - ex) `#FF0033 (#F03)` 같은 글자가 올때 압축 표현 가능.
     - ex) `#FFFFFF`, `#FFF` -> 하얀색
     - ex) `#000000`, `#000` -> 검은색
   - 뒤에 alpha값을 넣을 수 있음. 불투명도를 지정.(00~FF, 미입력시 FF)
     - ex) `#FF000020`
3. Decimal
    - 만약 10진수로 사용하고 싶다면 `rgb(0~255,0~255,0~255);`
      - 혹은 `rgba(0~255,0~255,0~255,0~1)` 해당 모양과 같이 넣을 수 있다.
    - HSL Color를 이용한 표현은 `hsl(각도, 채도, 명도)`와 같이 사용 가능.
        - ex) `hsl(0,100%, 50%)`
        - rgb와 마찬가지로 hsla로 불투명도를 설정할 수 있음.

4. System Colors
  각종 키워드로 사용자의 윈도우에서 설정한 색상, 테마 등을 가져다가 사용할 수 있다.

## CSS의 크기 단위
### 가변 크기.
1. em: 폰트사이즈 크기에 비례해서 크기지정(배수 지정)
2. rem: root em으로 HTML에 적용된 폰트사이즈에 비례
3. ex: 폰트의 소문자x사이즈의 높이값에 비례(혹은 em의 절반 값)
4. vs
5. vh: 화면 크기(view port)에서의 높이 비율
6. vw: 화면 크기(view port)에서의 넓이 비율
7. vmin: 가로, 세로 중 짧은 것을 기준으로(가로, 세로 화면 전환해도 상관x)
8. vmax: 가로, 세로 중 짧은 것을 기준으로
> %가 아닌 vh, vw...를 사용해야 하는 이유
> %의 기준점이 상위 계층을 기준으로 하기 때문에 HTML, BODY까지 전부 지정해주어야 한다. 
### 고정 크기.
1. in
2. px
3. pt
4. pc
5. cm
6. mm

## angle(시계방향)
1. deg (도, 한바퀴=360deg)
2. rad (라디안, 한바퀴=2*3.14rad )
3. grad (그라디안, 한바퀴=400grad)
4. turn (턴, 한바퀴=1turn)


## HTML 작동 방식
Load HTML -> Parse HTML (-> Load CSS -> Parse CSS ->) -> Create DOM tree -> Display
이를 간략화 하면 HTML 파일 --Load--> Document Objects --Show--> 사용자
Document Objects를 만드는 규칙은 각 웹표준을 따라 모델로 만들어줌.
해당 내용들을 javascript로 조작할 수 있음.


## 마우스 커서 모양 변경
- cursor
ex) `cursor: pointer;`
특정 박스에 해당 속성 적용시 마우스 커서를 변경할 수 있음.

## 투명도
- opacity
ex) `opacity: 0.3;`