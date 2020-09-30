package week4;
import java.util.ArrayList;
import java.util.Objects;

public class Storage extends ArrayList<Integer> {
	int max;
	
	public Storage(int max) {
		super();
		this.max = max;		
	}
	
	public Storage(Storage storage) {
		super(storage);
		max = storage.size();
	}
	
	@Override
	public boolean add(Integer in) {
			if(this.size() < max) {
				return super.add(in);
			}
			return false;
	}
	
	public boolean binarySearch(Integer in) {
		if( size() > 0) {
			Storage storage = bubbleSort();
			int l = 0;
			int r = size() - 1;			
			
			while (true) {	
				if (l > r) {
					return false;
				}
				else {
					int m = (l + r) / 2;
					if (Objects.equals(storage.get(m), in)) {
						return true;
					}
					else if (storage.get(m) < in) {
						l = m + 1;
					}
					else {
						r = m - 1;
					}
				}
			}
			
		}
		return false;
	}
	
	private void bubbleSortThis() {
		for (int x = 0; x < size(); x++) {
            for (int i = 0; i < size() - i; i++) {
                if (get(i).compareTo(get(i + 1)) > 0) {
                    int temp = get(i);
                    set(i,get(i + 1) );
                    set(i + 1, temp);
                } 
            }
		}
	}
	
	public Storage bubbleSort() {
		Storage storage = new Storage(this);
		
		storage.bubbleSortThis();
		
		return storage;
	}
	
	public void write() {
		for (Integer i : this) {
			System.out.print(i + " ");
		}
	}
}


