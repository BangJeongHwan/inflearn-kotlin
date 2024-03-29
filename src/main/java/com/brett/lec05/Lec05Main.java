package com.brett.lec05;

public class Lec05Main {
    public static void main(String[] args) {

    }
    public void validateScoreIsNotNegtive(int score){
        if(score < 0){
            throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없습니다.",score));
        }
    }
    private String getPassOrFail(int score){
        if(score >= 50){
            return "P";
        }else{
            return "F";
        }
        // 삼항연산자 사용
//        return score >= 50?"P":"F";
    }
    private String getGrade(int score){
        if(score >= 90) {
            return "A";
        }else if(score >= 80){
            return "B";
        }else if(score >= 70){
            return "C";
        }else{
            return "D";
        }
    }
    private void validate(int score){
        if(score >= 0 && score <= 100){
            System.out.println("%s 는 0부터 100사이 값입니다.");
        }
    }

    // switch
    private String getGradeWithSwitch(int score){
        switch (score/10){
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            default:
                return "D";
        }
    }

    private Boolean startWithA(Object obj){
        if(obj instanceof String){
            return ((String) obj).startsWith("A");
        }else{
            return false;
        }
    }

    private void judgeNumber(int number){
        if(number == 1 || number == 0 || number == -1){
            System.out.println("어디서 많이 본 숫자입니다.");
        }else{
            System.out.println("1, 0, -1 이 아닙니다.");
        }
    }

    private void judgeNumber2(int number){
        if(number == 0){
            System.out.println("주어진 숫자는 0 입니다.");
        }

        if(number%2 == 0){
            System.out.println("주어진 숫자는 짝수입니다.");
        }

        System.out.println("주어진 숫자는 홀수입니다.");
    }
}

