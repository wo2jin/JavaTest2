package chap01;

//int형 스택
public class IntStack {
	private int max;//스팩 용량 본체를 참조하여 크기를 만듦
	private int ptr;//스팩 포이터 스택의 현재 차있는 용량을 표시
	private int[] stk;//스팩 본체 
	// 실행시 예외 : 스택이 비어 이음
	public class EmptyInStackExection extends RuntimeException{
		public EmptyInStackExection() {}
	}
	
	//실행 시 예외 : 스택이 가득참
	public class OverflowInStackException extends RuntimeException{
		public OverflowInStackException() {}
	}
	
	//생성자
	public IntStack(int capacity){
		ptr = 0;
		max = capacity;
		try {
			stk=new int[max]; //스택 본체용 배열을 생성
		}catch(OutOfMemoryError e) { //생성할 수 없음
			max = 0;
		}
	}
	
	//스택에 x를 푸쉬  : push 메서드
	public int push(int x) throws OverflowInStackException{
		if(ptr >= max) { //스택의 현재 용량이 최대 용량을 벗어날 경우
			throw new OverflowInStackException();
		}
		return stk[ptr++]=x;
	}
	
	//스탤에서 데이터를 팝(정상에 있는 데이터를 꺼냄) :pop 메서드
	public int pop() throws EmptyInStackExection{
		if(ptr <= 0) { //스택이 비어있음
			throw new EmptyInStackExection();
		}
		return stk[--ptr]; 
	}
	
	//스택에서 데이터를 피크(정상에 있는 데이터를 들여다봄) : peek 메서드
	public int peek() throws EmptyInStackExection{
		if(ptr <= 0) {
			throw new EmptyInStackExection();
		}
		return stk[ptr -1];
	}
	
	//검색 메서드 index of
	public int indexOf(int x) {
		for(int i = ptr=1; i >=0; i--) { //정상부터 검사 : pop이 먼저 되는걸 찾기 위해
			if(stk[i]==x) {
				return i; //검색 성공
			}
		}return -1;
	}
	
	//스택을 비움
	public void clear() {
		ptr = 0;
	}
	//용량을 확인
	public int capacity() {
		return max;
	}
	//스택에 쌓여있는 데이터의 수를 반화 ㄴ: size
	public int size() {
		return ptr;
	}
	
	//스택이 가득찼는가? : ifFull
	public boolean isFull() {
		return ptr >= max;
	}
	
	//스택이 비어있는가? : isEmpty
	public boolean isEmpty() {
		return ptr >= max;
	}
	
	public void dump() {
		if(ptr <=0) {
			System.out.println("스택이 비어 있습니다.");
		}
		else {
			for(int i =0; i <ptr; i++) {
				System.out.print(stk[i]+" ");
			}
			System.out.println();
		}
	}
	
}
