# CSS3를 이용한 트랜지션
- 애니메이션을 구현하는 방법
1. CSS Transition
   - 시간을 주어 천천히 바뀌도록 만드는 효과
   - 단발성, 단순
2. CSS Animation
   - 반복, 이어 붙이기 등 트랜지션으로 부족한 부분
   - 미리 준비해서 하는 효과
3. Javascript Animation
   - 랜덤한 효과주기
   - 사용자 행위에 따른 효과를 줄때 사용.
   - CSS Animation을 다양하게 준비 후 자바스크립트로 사용하는 것이 좋음.

## CSS Transition
- 속성의 값이 변화되는 과정을 보여주는 효과
- `transition-property`
  - 특정 속성에만 적용
- `transition-duration`
  - 변화 속도 조절
  - < s | ms > 단위
- `transition-timing-function`
  - 변화 되는 과정 조절
  - `< ease | linear | ease-in | ease-out | ease-in-out | step-start | step-end | steps(<integer>[,[ start | end ]]?) >;`
  - ease: 부드러운 곡선형
  - linear 선형(등속)
  - step: 뚝뚝 끊어지는 계단형, 순간이동 한것처럼 보임.
- `transition-delay`
  - 지연시간 후 시작하도록 설정
- 또한 위치가 변화가 있어야 효과를 볼수있다.
- `transition`으로 간편하게 사용할 수 있다.
  - `transition: property duration delay`
  - ','로 여러 개수 부여 가능
  - ex) `transition: width 1s;` -> 너비가 변화하는 것에만 1초 애니메이션을 줘라

## CSS3에서 확장된 변형 속성
http://www.css3maker.com
- css를 간편하게 만들어볼 수 있는 사이트

### Transform
- Scale
- translate
- Rotation
- Skew
- 기존 변형 속성과의 차이점.
  - 기존 속성은 초기값을 지정해주어야 하는 불편함이 있었음.
  - 이는 다른 속성도 함께 수정해야하거나 다른 요소에 영향을 줄 수있음.
- `transform-origin`속성으로 초기 위치 설정 가능.(좌상당 위치 기준)


## 키 프레임 애니메이션
트랜지션은 한개의 단위라면
키프레임은 여러개의 동작을 이어붙일 수 있다.
```html
@keyframes slide-up{
  from{
    margin-top: 25px;
  }
  50% {
    margin-top: 50px;
  }
  to {
    margin-top: 0px;
  }
}

.galley-show-box > img:hover{
  animation-name: slide-up;
  animation-duration: 1s;
  animation-timing-function: ease;
}
```
- 속성
  - animation
  - animation-name
  - animation-duration
  - animation-timing-function
  - animation-delay
  - animation-iteration-count
  - animation-direction
  - animation-play-state
  - animation-fill-mode
