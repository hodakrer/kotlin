//0. 코틀린에서의 Deque
//코틀린은 자체적 Deque를 제공해주지 않는다.
//대신 Java의 api를 적극적으로 활용할 수 있다.
//그럼에도 코틀린 공식 호페이지에서 ArrayDeque에 대한 설명을 읽을 수 있다.
//  https://kotlinlang.org/api/5latest/jvm/stdlib/kotlin.collections/-array-deque/
import java.util.ArrayDeque

fun input() {

}

fun main(args: Array<String>) {
    //1. Deque 입력
    var dq = ArrayDeque<Int>()
    dq.addFirst(1) 
    dq.addLast(5)  
    dq.add(3)      
    println(dq)    //[1,5,3]

    //2. Deque 내용물 확인//
    println("사이즈가 얼마인가? : ${dq.size}")
    println("이 디큐가 비었나? : ${dq.isEmpty()}")
    println("이 값이 들어있나?  : ${dq.contains(3)}")
    println("이 값의 (가장 첫) 인덱스는? : ${dq.indexOf(3)}")
    println("이 값의 가장 마지막 인덱스는?: ${dq.lastIndexOf(3)}")

    println("맨 앞값은 무엇인가?: ${dq.first}")
    println("맨 앞값을, 없으면 Null을: ${dq.firstOrNull()}")
    println("맨 뒷값은 무엇인가?: ${dq.last}")
    println("맨 뒷값을, 없으면 Null을: ${dq.lastOrNull()}")
    
    println("")

    //3. 삭제//
    println("(앞값) 삭제: ${dq.remove()}")
    println("앞값 삭제  : ${dq.removeFirst()}")
    println("뒷값 삭제  : ${dq.removeLast()}")
    println("전체 삭제  : ${dq.clear()}")
    println(dq)

    //4. 타입 변환//
    println("set 타입으로: set(dq)")
    println("array 타입으로: toArray(dq)")
    println()
}
