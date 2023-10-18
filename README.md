// Exercise_1 100%
    // 정적 메서드 작성 (IOStrings 클래스 작성)
    // String[] loadArray(InputStream is, int n) : is에 의해 지정된 입력 채널에서 읽은 n개의 문자열 배열을 반환합니다.
    // void saveArray(OutputStream os, String[] sa) : os에 의해 지정된 출력 채널에 문자열 sa의 배열을 씁니다.
// Exercise_2 100%
    // 값이 0이 삽입될때까지 키보드에서 양의 정수 시퀀스를 읽고 읽은 값의 평균을 나타내는 double을 반화하는 공개 정적 방법을 작성하세요.
// Exercise_3 100%
    // '/',';','%' 문자중 하나로 시작하는 파일의 모든 줄을 비디오에 인쇄하는 공개 정적 방법을 작성하십시오. 파일의 이름은 매개 변수로 지정되어야 합니다.
// Exercise_4 100%
    // 파일 이름과 정수n을 나타내는 문자열을 매개변수로 취하고 파일에 크기 n의 곱샘 테이블을 쓰는 공개 정적 메서드를 작성하십시오. 
    // 1 2 3
    // 2 4 6
    // 3 6 9
// Exercise_5 100%
    // 구성된 학생들이 얻은 시험 점수에 대한 파일 정보를 읽는 공개 정적 방법을 작성하십시오.
    // Rossi 25 24 26 30 24 30
    // Bianchi 20 24 25
    // Verdi 30 24 30 27
// Exercise_6 100%
    // 택스트 파일의 일부 기능을 내보내는 IOFile 클래스를 실현하세요. 클래스에는 작동할 파일의 이름을 나타내는 String 유형의 매개 변수가 하나 있는 생성자가 있어야 하며, 다음 방법을 내보내야 합니다.
    // - int countLines() : 파일의 줄 수를 반환한다;
    // - void write(OutputStream os) : 파일의 내용을 os에 기록하는 것;
    // - void print() : 파일의 내용을 비디오에 인쇄하는것;
    // - void copy(String filename) : 파일의 내용을 filename이란 이름에 지정된 파일로 복사합니다.
    // - void delete() : 대용량 스토리지에서 파일을 삭제합니다.
// Exercise_7 TODO
    // 단위 4와 5와 같이 표현된 은행 계좌 세트를 처리하기 위해 클래스 HandleBA를 실현하십시오. 은행 계좌의 데이터는 다음 형식에 따라 텍스트 파일에 저장됩니다.
    // name, surname, balance
    // class HandleBA는 다음 메서드를 보내야함
    // HandleBAs(String filename) : 은행 계좌에 대한 데이터가 저장된 텍스트 파일의 이름을 매개 변수로 취하고 해당 파일과 관련된 객체를 만드는 생성자;
    // void interests(double rate) : 매개 변수에 지정된 이자율을 적용하여 모든 계좌의 잔액을 업데이트합니다.
    // printNegative() : 음수 잔액이 있는 모든 은행 계좌에 대한 데이터를 비디오에 인쇄 합니다.
// Exercise_8 TODO
    /*
    Exercise7_12의 {아파트}에 파일 이름을 매개 변수로 취하고 {아파트}에 대한 데이터를 파일에 저장하는 공개 메서드saveToFile을 추가합니다. 또한 입력 채널을 지정하는
    BufferedReader 객체를 매개 변수로 취하고, 채널에서 아파트에 대한 데이터(s saveToFile에 의해 작성된 대로 구성됨을 읽고, 아파트를 구성하고 반환하는 공개 정적 메서드
    readFromFile을 추가하십시오. 그런 다음, 파일 이름을 매개 변수로 취하고 파일에 있는 아파트에 대한 모든 정보를비디오에 인쇄하는 클래스 {아파트}의 클라이언트인 정적 메서드를 작성하십시오.
    */
// Exercise_9 TODO
        