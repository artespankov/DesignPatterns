package Iterator;

import java.util.Iterator;
import java.util.Calendar;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem>{
    MenuItem[] items;
    int position;

    public AlternatingDinerMenuIterator(MenuItem[] items){
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
    }


    public boolean hasNext(){
        return position < items.length && items[position] != null;

    }

    public MenuItem next(){
        MenuItem item =  items[position];
        position += 2;
        return item;
    }

    public void remove(){
        throw new UnsupportedOperationException("Alternating Diner Iterator.Menu Iterator does not support remove()");
    }

}
