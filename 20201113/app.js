20201113
app.js

// 배열 리터럴
const arr = [1,2, '문자열', {}]

const [a, b] = arr
console.log(a)
console.log(b)

// 객체 리터럴
const user = {
    id: 'abcdefg',
    name: 'Chiho Won',
    data: [1, 2, 3, 4,],
}
console.log('-------------')
const {id, name, data} = user
console.log(id)
console.log(name)
console.log(data)
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// 함수
function f(x) {
    console.log('호출됨!')
}

f(1)
f(1, 2, 3)
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
function sayHelloTo(name) {
    const message = `Hello ${name}!`
    return function () {
        console.log(message)
    }
}

const hello1 = sayHelloTo('Chiho Won')
const hello2 = sayHelloTo('test')
const hello3 = sayHelloTo('yejin')
hello1()
hello2()
hello3()
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// 클로저
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
function 환경이있는함수(x) {
    // 환경
    function counter() {

    }
    return counter;
}
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
const dd = 'ㅇㅇ'
function outer() {
    const name = '밖에 있어요'   // 유효 범위      
    function closure() {        // 클로저
        const inner = '내부에'
        console.log(`${name}, ${inner}, ${dd}`)
    }
    return closure;
}

const f1 = outer()
f1()
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// 예제
class 클로저 {
    멤버;
    생성자(파라미터) {
        멤버 = 파라미터
    }

    메서드() {

    }
}

function 생성자(파라미터) {
    function 메서드() {

    }
    return 메서드
}


const counter = countdown(10)
counter()   // 10
counter()   // 9
counter()   // 8
// ...
counter()   // 0
---->

function countdown(startAt) {
    let data = startAt
    function counter() {
        console.log(data--)
    }
    return counter
}
const c1 = countdown(10)
const c2 = countdown(100)
c1()
c1()
c2()
c2()


// 횟수 호출
function countdown() {
    let s = 0
    function counter() {
        console.log(`${++s}회 호출됨.`)
    }
    return counter
}

const c1 = countdown(10)
c1()
c1()
c1()
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// 경로 / 외 매핑
/**
 * 경로: /
 * 요청 HTTP 메서드: GET
 */
app.get('/', (req, res) => {
    res.send('Hello Express!')
})
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ