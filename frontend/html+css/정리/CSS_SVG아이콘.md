# SVG아이콘
## 비트맵 vs 벡터 이미지
- 비트맵
  - 픽셀로 표현하는 이미지
  - 크기를 늘리거나 줄인다면 원본 이미지에 손상이 간다.(이미지가 깨진다.)
  - .jpg, .jpeg, .png, .gif 형식 사용
- 벡터 이미지
  - 좌표를 기준으로 점과 점을 연결해 수학적으로 그림을 그리는 방식
  - 확대를 하거나 축소를 해도 손상되지 않음.
  - .ai, .eps, .svg 형식 사용

## SVG 아이콘 
- 아이콘 혹은 글씨를 svg로 따오는 기능이 있다.
- 텍스트로 인식이 된다. 즉, 이미지처럼 추가 로딩이 필요없다.
- 태그 형식으로 삽입할 수 있다
- css는 알맞는 코드로 변환해야한다.
- 변환에 좋은 사이트가 있다 -> https://yoksel.github.io/url-encoder

### svg
<svg xmlns="http://www.w3.org/2000/svg" width="14" height="20" viewBox="0 0 14 20">
  <path id="Icon_material-place" date-name="Icon material-place" d="M14.5, 3a7, 7, 0, 0, 0-7, 7c0, 5.25, 7, 13, 7, 13s7-7.75, 7-13A7, 7, 0, 0, 0, 14.5, 3Zm0, 9.5A2.5, 2.5, 0, 1, 1, 17, 10, 2.5, 2.5, 0, 0, 1, 14.5, 12.5Z"
        transform="translate(-7.5 -3)" fill="#fff"/>
</svg>  
해당 모양 삽입하기.  

- HTML 태그
```html
<svg xmlns="http://www.w3.org/2000/svg" width="14" height="20" viewBox="0 0 14 20">
  <path id="Icon_material-place" date-name="Icon material-place" d="M14.5, 3a7, 7, 0, 0, 0-7, 7c0, 5.25, 7, 13, 7, 13s7-7.75, 7-13A7, 7, 0, 0, 0, 14.5, 3Zm0, 9.5A2.5, 2.5, 0, 1, 1, 17, 10, 2.5, 2.5, 0, 0, 1, 14.5, 12.5Z"
        transform="translate(-7.5 -3)" fill="#fff"/>
</svg>
```

- CSS 변환
```html
background-image: url("data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' width='14' height='20' viewBox='0 0 14 20'%3E%3Cpath id='Icon_material-place' date-name='Icon material-place' d='M14.5, 3a7, 7, 0, 0, 0-7, 7c0, 5.25, 7, 13, 7, 13s7-7.75, 7-13A7, 7, 0, 0, 0, 14.5, 3Zm0, 9.5A2.5, 2.5, 0, 1, 1, 17, 10, 2.5, 2.5, 0, 0, 1, 14.5, 12.5Z' transform='translate(-7.5 -3)' fill='%23fff'/%3E%3C/svg%3E");
```
