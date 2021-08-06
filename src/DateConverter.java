public class DateConverter {
    public static void main(String[] args){
        String data = "1970/01/23";
        String year = data.substring(0,4);
        String month = data.substring(5,7);
        String day = data.substring(8);

        System.out.println(year + "년 " + month + "월 " + day + "일");
    }
}
