package level0;

/*
    a	b	result
    9	91	991
    89	8	898

    1. 991 919에서 큰 값 991 반환
    2. 898 889에서 큰 값 898 반환
 */
public class _04_더크게합치기 {
    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        int tmp = 0;
        // 숫자니까 String으로 변환
        String str1 = String.valueOf(a) + String.valueOf(b); // 991
        String str2 = String.valueOf(b) + String.valueOf(a); // 919

        // 비교를 위해 다시 int 변환
        int no1 = Integer.parseInt(str1); // 991
        int no2 = Integer.parseInt(str2); // 919

        if(no1 > no2){
            tmp = no1;
        }else if(no1 < no2){
            tmp = no2;
        }else if(no1 == no2){ // 같다면
            tmp = no1;
        }
//        return tmp;
    }
}
