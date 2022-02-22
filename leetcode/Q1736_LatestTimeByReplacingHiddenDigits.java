package leetcode;

class Q1736_LatestTimeByReplacingHiddenDigits {

    public static void main(String[] args) {
        String time = maximumTime("00:??");
        System.out.println(time);
    }
    public static String maximumTime(String time) {

        StringBuilder sb = new StringBuilder();

        String[] split = time.split(":");

        char[] hr = split[0].toCharArray();
        char[] min = split[1].toCharArray();


        if ((hr[0] == '0' || hr[0] == '1') && hr[1] == '?')
            hr[1] = '9';
        else if (hr[0] == '2' && hr[1] == '?')
            hr[1] = '3';
        else if (hr[0] == '?' && hr[1] == '?') {
            hr[0] = '2';
            hr[1] = '3';
        } else if (hr[0] == '?' && Integer.parseInt(String.valueOf(hr[1])) > 3)
            hr[0] = '1';
        else if (hr[0] == '?' && Integer.parseInt(String.valueOf(hr[1])) <= 3)
            hr[0] = '2';


        if (min[0] == '?')
            min[0] = '5';
        if (min[1] == '?')
            min[1] = '9';


        return sb.append(String.valueOf(hr)).append(':').append(String.valueOf(min)).toString();
    }
}