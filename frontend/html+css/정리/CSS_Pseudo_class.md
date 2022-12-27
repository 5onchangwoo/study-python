# Menu
## 메뉴 목록 스타일.
사진 + 링크 형태로 연결되어 있어야 함.
사진들이 먼저 나열되고 사진에 마우스를 갖다대면 메뉴이름이 나오도록 만들고자 함.
자바스크립트가 아닌 CSS의 기능만으로 구현.
따라서 마우스를 갖다대면 나올 CSS를 미리 구현 해놓아야 함.('overflow: hidden' 사용해서 숨김.)
'CSS-Box'의 'display'속성과 'Pseudo class'를 사용해서 구현.

## Pseudo class
가상 선택자로 태그를 직접적으로 선택하는 것이 아닌 상태, 구조등 다양한 것들을 이용해서 선택할 수 있는 기능.
`:first-child`와 같이 ':'를 이름앞에 붙이는 것으로 사용.
### 기본 구조
```html
selector:pseudo-selector{
  property: value;
}
```
- `:first-child`: 첫번째 요소 선택
- `:last-child`: 마지막 요소 선택
- `:nth-child(x)`: x(n)요소 선택(n=0,1,2,...)
  - ex) `:nth-child(odd)`: 홀수번째 요소들 선택
- `:hover`: 선택자 위에 마우스 커서가 있을 때
- `:active`: 선택자가 클릭된 상태
- `:focus`: 선택자가 마우스나 키보드에 의해 선택됐을 때
- `:visited`: 선택자(링크일 경우)가 이미 방문했던 사이트일때
