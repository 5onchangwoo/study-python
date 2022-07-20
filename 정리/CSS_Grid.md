# Grid
이전에는 격자형 레이아웃을 바로 할 수 없어서
선형 배치를 중첩해서 배치함.
반응형 웹을 만들 수 있다.
즉, 기기에 맞춰서 따로따로 만드는 것이 아닌 
모든 기기에 대해 비율단위로 조절할 수 있게 만들어 줌.

## Grid container
1. 고정된 혹은 유연한 트랙 사이즈
2. 아이템 배치
3. 고정된 콘텐츠의 추가적인 트랙의 생성
4. 정렬
5. 컨텐츠 겹치기(오버 래핑)

## Grid 용어
1. Track
   - Cell의 한 line
   - 행/렬 한 줄
2. Gutter
   - 트랙과 트랙 사이의 여백
   - Gap이라고도 함.
3. Cell
   - 아이템이 배치된 박스
4. Area
   - Cell들의 집합

## Grid Line 만들기
Grid를 생성할때 Box사이즈, 여백등을 잘 고려해야 한다.
- `display: grid;`
- `grid-template`
  - `grid-template-columns: size1 size2 size3 ...;`
  - `grid-template-rows: size1 size2 ...`
- 고정 크기의 grid는 뷰포트(화면)의 크기에 적절하게 대응하기 힘들다.
- 따라서 여러 기기에서 사용하는 것으로 예상되면 가변 크기를 사용하자.
  - ex) `grid-template-columns: 1fr 1fr 1fr;`
  - ex2) `grid-template-columns: auto auto auto;`
  - ex3) `grid-template-columns: 33% 33% 33%;`
  - %는 ex3과 같이 정확하게 100%로 안떨어질 수 있음. 따라서 사용X
  - auto는 **여백**만을 나누는 것.
    - 따라서 fr처럼 2칸을 차지하는 것같은 방법을 사용할 수 없음.
    - 또한 컨텐츠의 크기를 변경하면 cell안에서 여백이 생길 수 있음
  - fr은 **박스 크기**를 나누는 것.
    - 컨텐츠크기가 fr보다 커지면 따라서 커진다.
    - 이때 fr을 여러개 썼다면 다른 cell들은 남은 box크기를 나눠서 가져간다. 
  - auto와 fr같이 사용한다면 auto는 여백을 가져갈 수 없다.
- `repeat`: 반복 키워드
  - ex) `grid-template-columns: repeat(3, 1fr);`
  - == `grid-template-columns: 1fr 1fr 1fr;`
- `minmax`: 최솟값, 최댓값 설정
  - ex) `grid-template-columns: minmax(50px auto)`
  - == 최소 50px의 크기를 갖고 최댓값은 제한X
### Gap 크기 설정
Gap 설정시 전체적인 BOX의 크기가 그만큼 늘어난다.
- `grid-gap: value;` 가로,세로 전부 적용.
- `column-gap`, `row-gap`으로도 각각 가능하다.

## Grid에 아이템 배치하기.
### Grid Line number로 배치하기.
```html
grid-column-start
grid-column-end
grid-row-start
grid-row-end
```
- 4개를 전부 지정해 준다.(start~end미만의 cell)
- 또는 간편하게 지정할 수 있다.
```html
grid-column: 1 / 3;
grid-row: 2 / 3
```
혹은
```html
grid-column: 1 / span 2;
grid-row: 2 / span 1;
```
와 같이 span을 이용해 사용할 칸을 정해줄 수 있다.
하지만 -방향으로 사용시에는 span은 사용할 수 없다.
- ex)
```html
grid-column-start: 2;
grid-column-end:4;
grid-row-start: 1;
grid-row-end:1;
```
- 지정해주지 않는다면 다른 item과 겹치지 않게 자동으로 배치된다.
- 박스의 cell 개수보다 할당된 item의 칸이 더많다면 자동으로 추가된다.  
  하지만 크기는 설정해주지 않은 크기가 된다.
- 두개의 item을 겹치게 설정할 경우 후에 나온것이 위에 온다.

### 영역 정보로 배치하기.
- 영역에 이름을 붙이기.
- 2x3 크기의 grid, 
- cell에 이름 붙이기.
```html
grid-template-areas:
"header header"
"aside main"
"footer footer";
```
-> header, aside, main, footer 4개의 영역 이름.
  
- 이름 사용하기.
`grid-area: header`와 같이 사용.

### 종합 간편식
```html
.wrapper{
  display: grid;
  grid-template-column: repeat(4, 100px);
  grid-template-rows: repeat(3, 100px);
  grid-template-areas:
  "hd hd hd hd"
  "sd main main main"
  "ft ft ft ft";
}
```
을 간편식으로 바꾸면
```html
.wrapper{
  display: grid;
  grid-template:
  "hd hd hd hd" 100px
  "sd main main main" 100px
  "ft ft ft ft" 100px
  /100px 100px 100px 100px;
}
```
와 같이 간편하게 사용할 수 있다.

### Grid에 아이템 추가하기.
- 기존 영역보다 아이템이 더 많이 늘어나면 셀이 자동으로 추가됨.
- 기본 설정은 아랫쪽에 자동으로 추가됨.
- 너비에 남는 공간이 있다면 자동으로 cell을 채우고 싶다면 auto-fill을 사용.
    - `grid-template-columns: repeat(auto-fill, 100px);`
- 만약 아이템 개수만큼만 만들고 싶다면 auto-fit을 사용.
    - `grid-template-columns: repeat(auto-fit, 100px);`
- ex)
    - `grid-template-columns: repeat(auto-fit, minmax(100px, auto));`
- 새롭게 추가되는 아이템 크기가 원래 트랙과 같은 크기로 추가하려면?
    - `grid-auto-columns`, `grid-auto-rows`
- 새롭게 추가되는 트랙의 방향을 결정하는 방법.
    - `grid-auto-flow: < column | row >;`

### Line에 이름을 붙여서 사용하기.
```html
display: grid;
grid-template-columns: [aside-start] 250px;
                       [aside-end main-start] 1fr [main-end];
grid-template-rows: [header-start] 70px
                    [header-end aside-start] 1fr
                    [aside-end footer-start] 100px [footer-end];
```
- `grid-template-columns`로 라인의 이름과 그 사이 셀의 크기를 설정해주면된다.
- `grid-template-rows`도 마찬가지
- 하나의 라인에 이름을 두 개이상 사용할 수 있다.
- 영역이름을 직접 지정해주고 라인의 이름을 지정해주지 않아도 라인의 이름이 자동으로 부여된다.
  - < `area-start | area-end` >  
- 지정된 라인 이름으로 cell에 영역 부여하기.
    ```html
    .item1{
      grid-colum: aside-start / main-end;
      grid-row: header-start / header-end;
    }
    ```
와 같이 시작라인~끝나는라인을 지정해주면 된다.


### Alignment control (정렬)
- Inline / Row Axis: 수평축
  - `justify-items`
  - `justify-self`
  - `justify-content`
- Block Axis: 수직축
  - `align-items : < auto | center | normal | start | end | stretch | baseline >;`
    - 각 아이템에 대한 일괄 적용.
    - 컨테이너에 적용하는 개념
  - `align-self`
    - 특정 아이템에 개별 적용
  - `align-content`
    - 컨테이너 자체를 정렬(모든 cell을 하나의 item처럼)
    - 박스의 기본 크기는 컨테이너의 크기와 같음.
    - `< space-between | space-around`
- 디폴트는 둘다 `stretch`이다.
- 아이템의 기본크기는 수평, 수직 전부 콘텐츠의 크기.
- 수직 + 수평 한번에 설정
  - `place-items: align justify`: 순서를 꼭 지켜야 한다.
  - `place-content`
  - `place-self`
- 