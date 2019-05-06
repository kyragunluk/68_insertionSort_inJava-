public class Sort_insertionStyle{
    public static void main(String[] commandLine) {
        List_inArraySlots newList = new List_inArraySlots();
        newList.add(4);
        newList.add(6);
        newList.add(2);
        newList.add(7);
        newList.add(1);
        newList.add(5);
        newList.add(3);
        System.out.println(insertionSort(newList));
    }

    public static List_inArraySlots insert1( List_inArraySlots list
                       , int alreadyInserted){
        int valueToAdd = list.get(alreadyInserted);
        for (int index = alreadyInserted ; index > 0 ; index --){
            if (valueToAdd > list.get(index-1)){
                for (int i = alreadyInserted ; i > index ; i --){
                    list.set(i,list.get(i-1));
                }
                list.set(index,valueToAdd);
                return list;
            }
        }
        for (int i = alreadyInserted ; i > 0 ; i --){
            list.set(i,list.get(i-1));
        }
        list.set(0,valueToAdd);
        return list;

    }

    public static List_inArraySlots insertionSort (List_inArraySlots list){
        for (int index = 0 ; index < list.size() ; index ++){
            list = insert1(list,index);
            // for debugging
            System.out.println( "    dbg: "
              + "after inserting element " + index
              + " elements: " + list
              );
        }
        return list;
    }
}
