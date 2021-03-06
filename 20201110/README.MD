
# 1. form

사용자 입력을 받는 부분

<태그 속성=값>

form 속성 정리
- method : HTTP method
  - GET
  - POST
  - DELETE
  - PUT
  - HEAD
  - TRACE
  - CONNCET
  - OPTIONS
- name : 폼 이름. 폼 구분을 위한 이름
- action : URI(i.e. `/path/to/resource`)
- target

# 쉘(명령 프롬프트, bash 등)

## 1. 디렉토리

- cd : 디렉토리 이동
  - . : 현재 디렉토리
  - .. : 상위 디렉토리

```bash
cd [절대경로]
cd /path/to/file    # 이 경로로 이동

cd [상대경로]
cd java             # 현재 디렉토리에 있는 java 디렉토리로 이동
```
상대경로
- `[현재 디렉토리 위치]` + [상대경로 디렉토리]

## 2. 디렉토리 출력

윈도우 - dir
리눅스/맥 - ls


# 3. CSS


- 기기별 스타일 적용 가능
- html 문서와 별개로 스타일 지정 가능
- 버전 관리

# 4. CSS 기본 구조

```html
선택자 {
    스타일_속성: 값;
    스타일_속성: 값;
    스타일_속성: 값;
    스타일_속성: 값;
}
```

선택자 - 태그를 선택하는 방법들에 대한 것  
- 선택자로 선택할 수 있는 것
  - 태그를 직접 선택
  - 클래스 이름
  - id
  - 특수한 선택자

# 5. 스타일 시트 적용하는 3가지 방법

- 문서 내부 (style 태그)
- 문서 외부 별도로 (css 파일 임포트)
- 인라인 스타일 (태그에 직접 스타일 지정)

## 5.1. 문서 내부

style 태그 내부
```html
<style>여기에</style>
```

## 5.2.  인라인 스타일

태그의 style 속성에 직접 지정
```html
<p style="
        background-color: black;
        color: white;
        padding: 20px;
        ">
```

## 5.3. 문서 외부에

```html
<link href="path/to/css/file" rel="stylesheet" type="text/css">
```

# 6. 기본 선택자

- `*` : 전체를 선택
  - 요즘은 거의 0으로 리셋하고 시작함
    ```
    * { padding: 0;
        ...
  
    }
    ```
- 태그 : 해당 태그를 선택
- 클래스 : `.`로 시작. 해당 클래스 (복수 선택 가능) > 가장 많이 쓰임
- 아이디 : `#`로 시작. 해당 아이디  
 
## 6.1. 전체 선택자
## 6.2. 태그 선택자
## 6.3. 클래스 선택자
## 6.4. 아이디 선택자

```html

<!DOCTYPE html>
<html>
    <head>
        <title>CSS 실습</title>
        <style>
            .paragraph-style {
                background-color: black;
                color: rgb(255, 174, 187);
               
            }
            .font-style {
                font-size: 0.8rem;
                color: #c0ffee;
            }

            #p1 {
                padding-bottom: 100px;
            }

        </style>
    </head>

    <body>
        <!--인라인 스타일 지정 -->
        <p id="p1" class="paragraph-style font-style">        
            Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
        </p>
        <p>
            Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
        </p>
        <p class="paragraph-style">
            Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
        </p>
    </body>
</html>

```

# 7. 스타일 적용 기준

- 우선순위
- 상속

## 7.1. 우선순위

- 중요도
- 명시도
- 선언순서
  
### 7.1.1. 중요도

1. 사용자 스타일 시트
2. 중요 스타일(!important)
3. 스타일(css)
4. 브라우저 스타일 시트

### 7.1.2. 명시도

1. !important
2. 인라인 선택자 (태그에 직접 지정)
3. 아이디 선택자
4. 클래스/속성/가상 선택자
5. 태그 선택자(태그 직접 지정)
6. 전체 선택자(*)
7. 상위 요소에 의해 선택된 속성

### 7.1.3. 선언순서



# 8. 연결자 (combinators)

- 후손 선택자
- 자손 선택자
- 인접 형제 선택자
- 형제 선택자

## 8.1. 후손 선택자

띄어쓰기로 구분해줌
```html
상위요소 후손

<style>
    #container h1 {
        color: skyblue;
    }
</style>
```

## 8.2. 자식 선택자
```html
부모요소 > 자식요소

<style>
    #container > ul {
        color: skyblue;
    }
</style>
```

## 8.3. 인접 형제 선택자
```html
형제 + 인접형제

<style>
    #ct-h1 + * {
        color: skyblue;
    }
</style>
```

## 8.4. 형제 선택자
```html
형제 ~ 형제들
```

# 9. 속성 선택자

## 9.1. 속성 선택자

```html
[속성이름]
```

## 9.2. [속성=값] 선택자

```html
[속성명=값] {

}
```

## 9.3. [속성명|=값]

이 값이 포함되면 선택.

## 9.4. [속성명^=값]

이 값으로 시작하면 선택.

## 9.5. [속성명$=값]

이 값으로 끝나는 경우 선택.


# 10. 그 외 선택자

가상 클래스, 가상 요소

## 10.1. 동작에 따른 가상 클래스

- :link
- :visited
- :hover
- :active
- :focus

## 10.2. 태그의 상태에 따른 가상 클래스

- :enabled - 활성화 된 상태
- :disabled - 비활성화
- :checked - 체크된 상태

## 10.3. 구조 가상 클래스

- :root - 문서 전체
- :not
  ```html
  a:not
  --> a가 아니면
  ```
- :nth-child(n)
  - 2n - 1, odd
  - 2n + 1, even
```html
    <style>
        li:nth-child(odd) {
            background-color: darkcyan;
        }
    </style>
```
