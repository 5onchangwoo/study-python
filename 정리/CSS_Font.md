# 폰트 스타일링
## 시스템 폰트
해당 폰트가 사용자가 가지고 있어야 사용할 수 있다.
### font-size
폰트 크기, 기본은 16px
### font-family (글꼴 패밀리)
한 글꼴의 다양한 버전을 담은 대표이름.(글꼴 이름) 
한 패밀리에는 여러개의 버전(구성원)이 포함 되어있음.(보통, 굵게, 가늘게, 기울임꼴 등등)
즉, 각종 설정을 했을때의 글꼴이 패밀리안에 있어야 적용된다.
대체 패밀리를 설정할 수 있다.
ex) `font-family: 'Segoe UI', '굴림', '고딕', Verdana, sans-serif;`

> generic names:
> 폰트 계열로 해당 계열의 글꼴중 하나를 가져 온다.
> 계열에는 5가지가 존재.
> 1. serif: 꾸밈이 들어가는 글꼴
> 2. sans-serif: 꾸밈이 들어가지 않은 글꼴
> 3. monospace: 폰트의 간격을 다 같게 만든 글꼴
> 4. cursive: 필기체 글꼴
> 5. fantasy: 데코레이팅이 많이 가미된 글꼴(그림인지 글자인지 구별하기 어렵다.)

### font-style
폰트의 기울기
1. normal
2. italic - 기울임꼴
3. oblique
4. oblique 10deg; - 같은 기움일꼴 이지만 각도를 설정. 
   하지만 family에는 정해진 각도가 있으므로 비슷한 각도의 구성원을 가져옴.
### font-weight
폰트의 굵기
1. 이름
   Thin, Extra Light, Light, Normal, bold 등등
2. 값
   100, 200, 300, ... , 1000
### font-stretch
폰트의 간격. 글꼴 패밀리에 포함이 되어있어야 적용이 된다.
1. condensed
2. expanded
3. ultra-expanded
4. value
### color
### font-synthesis

## 웹 폰트
특정 폰트가 없다면 자동으로 다운로드 시켜 적용시키도록 할 수 있다.
구글 폰트에서 무료로도 받을 수 있다.
<a href="https://fonts.google.com/">구글 폰트 접속하기</a>

@import url("api주소")형식으로 폰트를 자동으로 다운로드 받도록 만들 수 있다.

혹은 시스템폰트 패밀리 파일을 웹폰트로 사용할수 있도록 변환해주는 툴, 사이트등 서비스가 존재한다.
패밀리 파일을 웹폰트 파일로 전환 후 아래 방법으로 적용시켜주면 된다. 
```html
@font-face{
  font-family: "패밀리 네임";
  src: url("변환한 폰트파일");
}
```




