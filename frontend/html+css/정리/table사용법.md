# 테이블 관련 태그

격자형으로 맞춘 콘텐츠를 만들때 사용.

### table

+ 데이터의 영역과 헤더의 영역을 구분해줘야 함.
+ 테이블 태그에는 thead, tfoot와 tbody만 와야함.
+ `thead`: 열의 header(속성 명)
+ `tfoot`: 테이블의 foot, 저작권정보 등 기재.
+ `tbody`: 테이블 실질적인 데이터 공간
  + tbody는 여러개로 나눌 수 있음.
+ `caption`: 테이블 설명 설정(css로 위치 변경 가능.)
+ `tr`: raw(행)
  + `rowspan`: 사용한 행의 개수
  + `td`: dataset(열)
    + `colspan`: 사용할 열의 개수
  + `th`: 행의 header(레코드 명)
