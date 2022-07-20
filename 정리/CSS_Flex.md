# Layout 스타일

## Layout이란?

1. 박스를 만들고(크기, 배경)
2. 그안에 들어가는 아이콘, 버튼, 목록등을 스타일
3. 결합할때 콘텐츠들을 배치(Layout)
   1. block layout
   2. inline layout
   3. table layout
   4. floats layout
   5. positioned layout
   6. flex / grid layout
   7. multi column layout

## CSS Layout

1. 수동모드 -> position
   - absolute: 절대위치, 문서의 좌상단 기준으로 위치를 고정시킴. 영역의 크기가 고정일때 주로 사용.
     부모가 relative가 되면 자식이 absolute를 한다면 부모 박스의 영역을 기준으로 잡음.
   - relative: 상대위치,
   - fixed: 화면에 고정된 위치, 뷰포트의 좌상단 기준으로 위치를 고정시킴.(스크롤시 따라옴)
   - sticky: 테이블 헤더를 고정할때 사용
2. 자동모드 -> display (postion:static 으로 자동 설정)
   위치를 겹칠수 없음.
   - block: 수직
   - inline: 수평
   - inline-block: 수직+수평
   - table: 기본 표
   - list-item: 기본 목록
   - grid: 표, table에 없던 기능들을 추가해서 새로 나온것.
   - flex: 목록, list-item에 없던 기능들을 추가해서 새로 나온것.
   - none
   - contents

### display

`<display-outside>`

### 레이아웃과 display 관계

outside -> inside -> internal

### Flex Display `display: flex`

#### Flex Termnology

여러 방향을 축으로 잡을 수 있기 때문에
축을 item들을 놓는 방향축인 main axis와 main을 가로지르는 축인 cross axis가 있다. (그 안의 item들도 적용된다.)
따라서 width와 height는 잘 사용하지 않는다.
ex) 수평축을 main axis로 잡는다면 cross axis는 수직이 된다.
main start, main end / cross start, cross end

- flex container:
- flex box:
- flex item:
  - flex box안에 있는 콘텐츠를 뜻함.
  - 해당 태그가 가지고 있던 스타일이 flex 스타일로 적용이 된다.(크기, 위치등)

#### Flex Lines (줄세우기)

- flex-direction
  - `<row(default) | row-reverse | column | column-reverse;>`
  - 기본 크기는 콘텐츠의 크기와 동일.
- flex-wrap
  - flex는 영역이 부족하다고 자동으로 줄바꿈을 해주거나 스크롤바를 만들어주지 않음.
    즉 넘어가면 그대로 짤리게 됨. 해당 설정을 변경해주면 해결할 수 있다.
  - `<nowrap(default) | wrap | wrap-reverse;>`
- flex-flow: direction + wrap

#### Flexibility (크기 지정)

- flex-grow
  - 여백 제거, 여백을 item들이 같은비율로 나눠 갖는다.
  - 박스의 크기가 다 같아지진 않는다.
  - `0(default) | rate;`
- flex-shrink
  - 크기를 비율에 맞춰 자동으로 맞춰주는 기능.
  - 만약 어떤 크기를 무조건 유지하고 싶다면 0으로 설정하면 된다.
  - 비율(rate)을 높이면 줄어드는 비율을 높일 수 있다.
  - `1(default) | 0 | rate`
- flex-basis
  - 기본 크기 설정, item들이 같은 크기를 갖는다. (여백을 채워주지 못함)
  - width로 지정해주면 메인 방향 축과 다른 방향으로 적용이 될 수 있다.
  - 따라서 flex들의 item들 에게는 flex-basis로 지정을 해주는 것이 좋다.
  - `flex-basis: 100px;`
- flex
  - 위의 세가지 옵션을 편하게 적용할 수 있음.
  - `flex: grow shrink basis;`와 같이 적용
  - ex) `flex: 0 0 100px;`
  - `1 1 auto`가 기본값
  - 자주 사용하는 키워드
    - `flex: none;` (= 0 0 auto;)
    - `flex: auto;` (= 1 1 auto;)
    - `flex: initial;` (= 0 1 auto;)
    - `flex: 100px;` (= 1 1 100px;)
    -

#### Alignment (위치 정렬)
여백이 있을때 작동하는 기능.
즉 box의 크기가 item보다 커야한다.
또한 

- justify-content 
  - 모든 item 대상 
  - 메인 축 정렬.
  - `flex-start | flex-end | center | space-between | space-around`
  - `space-between`: 여백을 item수 - 1으로 나눈뒤 각 아이템 사이에 넣어준 것.
  - `space-around`: 여백을 item*2 한뒤 각 아이템의 좌우에 넣어준 것.
- align-items
  box의 크로스축을 키웠을떄 정렬을 하지 않으면 부모BOX의 크기를 따라간다.
  따라서, 정렬을 해주어야 콘텐츠높이로 변경이 된다.
  또한 직접 BOX의 높이를 지정해주면 해당 높이로 지정이 된다.  
  - 모든 item 대상
  - 크로스 축 정렬.
- align-self
  - individual flex item 대상
  - 전체 적용후에 따로 적용시킬 것이 있을때 사용.
  - 크로스 축 정렬
  - `stretch`: 크로스 축으로 부모 100%
- align-content
  - flex lines에 packing되어 있는 item 대상.
  - 크로스 축 정렬.
  - items이 2층으로 넘어갔을때 한묶음으로 사용.(items는 각각의 층에 적용됨.)
      
#### Ordering (순서)
- order

<hr>

> flex-basis vs width
> flex안에서 사용 시 flex-basis의 우선순위가 높다.

<hr>

> flex의 여백을 특정 위치에 모두 넣고싶을 때
> margin을 사용하면 된다.
> margin에 auto를 설정하면 모든 여백을 넣어달라는 것.