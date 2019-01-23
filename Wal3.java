import java.util.*;
import java.io.*;

 class ONEKING {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			ArrayList<Pair> list = new ArrayList<Pair>();
			for(int i = 0;i < n; i++) {
				String[] split = br.readLine().split(" ");
				Pair p = new Pair();
				p.l = Integer.parseInt(split[0]);
				p.r = Integer.parseInt(split[1]);
				list.add(p);
			}
			int bombs = 0;
			Collections.sort(list);
			
			boolean destroyed[] = new boolean [n];
			for(int i = 0; i < n; i++) {
				if(destroyed[i]) {
					continue;
				}
				bombs++;
				for (int j = i + 1;j < n; j++) {
					if(!destroyed[j]) {
						if(list.get(j).l <= list.get(i).r)
						destroyed[j] = true;
					}
				}
			}
			System.out.println(bombs);
		}
	}
	
}
class Pair implements Comparable<Pair>{
	int l;
	int r;
	@Override
	public int compareTo(Pair o) {
		return (this.r - o.r);
	}
}