package hw250521_2;

import java.util.*;

public class eight {
	
    public static void main(String[] args) {
    	
        String[] s = { "독수리", "고양이", "강아지" };
        List<String> list = Arrays.asList(s);

        List<String> all = new ArrayList<>(list);
        System.out.println("nCopies : " + Arrays.asList("개미", "개미"));

        Collections.fill(all, "벌");
        System.out.println("'벌'을 채운 후 : " + all);

        all.clear();
        Collections.addAll(all, "벌", "벌", "독수리", "고양이", "강아지");
        System.out.println("리스트를 모두 추가한 후 : " + all);

        Collections.shuffle(all);
        System.out.println("리스트를 섞은 후 : " + all);

        Collections.sort(all, Collections.reverseOrder());
        System.out.println("리스트를 역순으로 정렬한 후 : " + all);

        System.out.println("리스트에서 최소 : " + Collections.min(all));
        System.out.println("리스트에서 최대 : " + Collections.max(all));
        System.out.println("리스트에서 '벌'의 빈도 : " + Collections.frequency(all, "벌"));
    }
}
