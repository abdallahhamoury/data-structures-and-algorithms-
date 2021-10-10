# data-structures-and-algorithms-

### array-reverse
------------------------------------------------------------------------

![Image of Yaktocat](https://github.com/abdallahhamoury/data-structures-and-algorithms-/blob/array-reverse/class1.jpg?raw=true)




public static void clock(){
    LocalDateTime now = LocalDateTime.now();
    int nowSec=0;
    while(true){
        now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        if(nowSec == second){

        }
        else {
            System.out.println(time);
            nowSec= second;
        }
    }
