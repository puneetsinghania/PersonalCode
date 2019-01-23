import java.util.*;

public class Target1 {

	public static void perms( Map<Integer,Set<Integer>> map, List<Map<Integer,Integer>> list ) {
        recursion( map, new LinkedList<Integer>( map.keySet() ).listIterator(), new HashMap<Integer,Integer>(), list );
    }

    
    private static void recursion( Map<Integer,Set<Integer>> map, ListIterator<Integer> iter, Map<Integer,Integer> cur, List<Map<Integer,Integer>> list ) {
            
    Set<Integer> itr=map.keySet();
    
    List l=(List) map.values();
    
    
    
    
    	
        if( !iter.hasNext() ) {
            Map<Integer,Integer> entry = new HashMap<Integer,Integer>();

            for(Integer key : cur.keySet() ) {
                entry.put( key, cur.get( key ) );
            }

            list.add( entry );
        } else {
        	Integer key = iter.next();
            Set<Integer> set = map.get( key );

            for( Integer value : set ) {
                cur.put( key, value );
                recursion( map, iter, cur, list );
                cur.remove( key );
            }
            
            

            iter.previous();
        }
    	
    	 //Iterator<Entry<Integer,Set<Integer>>=map.entrySet().iterator();
    	
    }

    public static void main( String[] args ) {
        Map<Integer,Set<Integer>> map = new HashMap<Integer,Set<Integer>>() {{
            put( 1, new HashSet<Integer>() {{
                add( 8 );
                add( 9 );
                add( 10 );
            }} );
            put( 2, new HashSet<Integer>() {{
                add( 5 );
                add( 6 );
                add( 23 );
            }} );
            put( 8, new HashSet<Integer>() {{
                add( 7 );
                add( 4 );
            }} );
        }};
        List<Map<Integer,Integer>> list = new LinkedList<Map<Integer,Integer>>();
        perms( map, list );

        System.out.println(list);
        System.out.println(map);
        
       
       /* for( Map<Integer,Integer> perms : list ) {
            System.out.println( perms );
        }*/
    }
}