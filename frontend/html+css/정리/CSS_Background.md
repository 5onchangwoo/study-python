# CSS 박스 스타일

* 스타일 적용 순서.
  1. 레이아웃 블록 스타일 (CSS building blocks)
  2. 콘텐츠 블록 스타일 (Styling text)
  3. 콘텐츠 레이아웃 (Styling text)
  4. 텍스트 스타일 (CSS layout)

> 모바일의 경우 너비는 100%으로 고정되어있고 높이만 설정해주면 된다.
> height: 50px;
> background-color:red;

* 콘텐츠 박스의 구성
  마진(Margin) - 경계선(Border) - 패딩(Padding) - 콘텐츠

### 레이아웃 블록 스타일

1. 스타일 클래스 명명
2. 각 클래스의 스타일 설정
3. 블록에 css 삽입

#### 배경 이미지 넣는 방법(background)

`background : none`: 배경이미지 X
`background-color`: 배경이미지 색상
`background-image : url(path);`: 배경에 외부 이미지파일 삽입.(기본은 반복)
`background-image : url1(path), url2(path), ... ;`: 해당 방법으로 여러개의 이미지를 동시 삽입 가능.
ex)여러개 넣을때 정렬해서 넣는 방법.
```html
background: url1(path1) no-repeat 10px 20px,
            url2(path2) repeat-x top right,
            url3(path3) center,
            url4(path4) repeat-y;
```


`background-repaeat: repeat-x;`: 배경이미지 x축 반복
`background-repaeat: repeat-y;`: 배경이미지 y축 반복
`background-repaeat: repeat-xy;`: 배경이미지 xy축 반복
`background-repaeat: no-repeat;`: 배경이미지 반복 X

`background-position: 10px 10px;`: x,y 좌표(좌측 상단이 0 0)
`background-position: right bottom;`: x,y축 위치 키워드로 설정.
`background-position: top 20px right 10px;`: 키워드+좌표로 설정도 가능하다.

`background-size: 50px 50px;`: 이미지 크기 고정 크기로 지정(x축, y축)
`background-size: 50% 50%;`: 이미지 크기 비율로 지정(x축, y축)
`background-ize: contain;`: 비율을 깨지지 않고 짤리지 않게 최대한 크게(긴쪽의 사이즈를 박스크기에 맞춤.)
`background-size: cover;`: 비율을 깨지지 않고 최대한 크게(이미지 짤릴수 있음)

 
`background-attachment: fixed`: 이미지를 고정시키는 것. 바깥쪽에 박혀있는 느낌 요소 overflow 스크롤에는 반응하지 않음.
`background-attachment: scroll`: 뷰포트(화면)에 이미지를 고정시키는 것. 항상 같은 화면
`background-attachment: local`: 요소 그자체에 이미지를 고정시키는 것. 요쇼 내의 overflow 스크롤에 반응


### Gradient(그라디언트 색상)

이미지 형식으로 스타일이 지정이 되기 때문에 주의

1. Linear(선형)
   `background: linear-gradient(#rgb1, #rgb2);`
2. Radial(원형)
   `background: radial-gradient(#rgb2, #rgb2);`

```html
    background: radial-gradient(
        <ending-shape>  <!-- circle OR ellipse-->
        <size>  <!--closest-side, closest-corner, farthest-side, farthest-corner-->
        at <position>,   <!--background-position OR transform-origin-->
        <linear-color-stop>,
        <color-hint>
    )
```

3. Repeating Linear(반복 선형)
   `background: Repeating-linear-gradient(#rgb2, #rgb2, size);`
4. Repeating Radial(반복 원형)
   `background: Repeating-radial-gradient(#rgb2, #rgb2, size);`
5. Conic(원뿔형)
   `background: conic-gradient(#rgb2, #rgb2, size);`

#### 예시

```html
  linear-gradient(
    to right, <!--to top, to bottom, to left, to right or angle-->
    red 20%,
    orange 20% 40%,
    yellow 40% 60%,
    green 60% 80%,
    blue 80%
  );
```
