/*
— Метод getTime() возвращает количество миллисекунд, которое хранится в объекте Date.
— Метод after() проверяет, что дата, у которой мы вызвали метод, идет после переданной в метод даты after.
— Методы getHours(), getMinutes(), getSeconds() возвращают количество часов, минут и секунд у объекта, у которого их вызвали.
— Более того, в последнем примере ты видишь, что можно повлиять на дату/время, сохраненное в объекте Date. Мы получаем текущее время и дату, а затем сбрасываем часы, минуты и секунды в 0. Так же устанавливаем месяц в Январь, а день месяца в 1. Теперь объект yearStartTime хранит дату и время 1 января текущего года 0 часов 0 минут 0 секунд.
— Потом мы снова получаем текущую дату currentTime, и вычисляем разницу в миллисекундах между двумя датами. Я про msTimeDistance.
— Затем делим msTimeDistance на количество миллисекунд в сутках и получаем полное количество дней, прошедшее с начала года до сегодняшнего дня!
*/
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MyData {
    public static void main(String[] args) throws Exception{
        //howManyDaysYear();
        //howMuchTimeToday();
        //someTime();
        //today();
        //pauseSek();
        //System.out.println(shifter("abcde"));
        //yyyy .MM.dd G 'at' HH:mm:ss z
        //System.out.println(currentDate("D"));
        System.out.println(formatDate("2013-08-18"));//выводит дату в виде "AUG 18, 2013".
    }
    public static String formatDate(String s ) throws ParseException {
        //в объект simpleFormat записываем тот формат, в который нужено преоброзовать
        SimpleDateFormat simpleFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        //в объект simpleFormat2 записываем именно фомат входной даты т.е. s ->"2013-08-18"
        SimpleDateFormat simpleFormat2 = new SimpleDateFormat("yyyy-MM-dd");
        //В объект data записываем запарсенную строку
        Date date = simpleFormat2.parse(s);
        //Форматируем строку так, как нужно по заданию
        return simpleFormat.format(date).toUpperCase();
    }

    public static String currentDate(String...style) {
        StringBuilder s = new StringBuilder();
        for (String s1 : style) {
            s.append(s1).append(" ");
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(s.toString());
//        DateFormatSymbols myDateFormatSymbols = new DateFormatSymbols() {
//            @Override
//            public String[] getMonths() {
//                return new String[]{"января", "февраля", "марта", "апреля", "мая", "июня",
//                        "июля", "августа", "сентября", "октября", "ноября", "декабря"};
//            }
//
//        };
        return dateFormat.format(new Date("MAY 20 2018"));
    }

    private static String shifter(String s){
        StringBuilder sh = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sh.append(s.charAt(i));
        }
        return String.valueOf(sh);
    }
    private static void howManyDaysYear() {
        //Сколько дней прошло с начала года
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11

        Date currentTime = new Date();
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней
        System.out.println("Days from start of year: " + dayCount);
    }

    private static void howMuchTimeToday() {
        //Сколько прошло времени с начала сегодняшнего дня
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);
    }

    private static void someTime() throws InterruptedException {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;   //    +5 секунд
        Date endDate = new Date(endTime);

        Thread.sleep(3000);              // ждем 3 секунды

        Date currentTime = new Date();
        if(currentTime.after(endDate)){//проверяем что время currentTime после endDate
            System.out.println("End time!");
        }else System.out.println("No End time!");
    }

    private static void today() {
        Date today = new Date();
        System.out.println("Current date: " + today);
    }

    private static void pauseSek() throws InterruptedException {
        Date currentTime = new Date();           //получаем текущую дату и время
        Thread.sleep(5000);                      //ждём 3 секунды – 3000 миллисекунд
        Date newTime = new Date();               //получаем новое текущее время

        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Time distance is: " + msDelay/1000 + " in sek");
    }
}
