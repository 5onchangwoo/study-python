# BOX
## box-sizing
- border-box
  - 박스의 사이즈를 padding+border를 포함한 사이즈로 설정
- content-box (기본 값)
  - 박스의 사이즈를 콘텐츠박스의 크기로 설정(padding, border의 크기만큼 더 커진다.)
- inherit
  - 부모박스와 같은 설정(상속)

# width, height
크기를 지정해주는 기능.
- `width`: 너비
- `height`: 높이
- `max-`: 최댓값 지정
  - ex) `max-width: 20px;`
- `min-`: 최솟값 지정
  - ex) `min-height: 50px;`

## Box Layout Modes
### display
#### 기본 속성
- block
  - 항상 새로운 라인에서 시작. (수평 배치, 해당라인의 모든 너비 차지)
  - height만 지정 가능
- inline
  - 새로운 라인에서 시작하지 않음. (수직 배치, 너비가 콘텐츠너비와 같음)
  - weight만 지정 가능
- inline-block
  - 너비와 높이를 조절할 수 있음. (block과 inline의 중간단계)
- flex
  - 박스 내부의 콘텐츠들을 조절
  - `align-items: center;`: 내부의 콘텐츠 수평 위치를 박스의 가운데 정렬 
  - `justify-content: center;`: 내부의 콘텐츠 수직 위치를 박스의 가운데 정렬
    - 해당 방법으로 정렬을 해주어도 텍스트 자체는 가운데 정렬이 되어있지 않음.
    - 따라서 `text-align: center`를 추가해주어야 함.


여러 속성 분류
- `display-outside`
  - block (수직) | inline (수평) | run-in
- `display-inside` 
  - flow | flow-root | table | flex | grid | ruby
- `display-listitem`
  - <display-outside>? && [ flow | flow-root ]? && list-item 
- `display-internal`
  - table-row-group | table-header_group | table-footer-group |
    table-row | table-cell | table-column-group | table-column | table-caption|
    ruby-base | ruby-text | ruby-base-container | ruby-text-container
- `display-box`
  - contents | none
- `display-legacy`
  - inline-block | inline-table | inline-flex | inline-grid

#### 박스의 크기를 콘텐츠의 크기를 기준으로 가변적으로 사용하기.
- padding 사용하기.
- 제품을 만들때 해당 제품에 맞춰서 개발하는 것이 좋다.
- (모든 상황을 고려해서 개발하는 것은 라이브러리 개발이다.)
- 만약 텍스트의 크기에 따라 변경되길 원한다면 padding을 비율로 지정해주면 된다.(em) 