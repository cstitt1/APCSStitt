package myArrayList;

public class MyArrayList<E>
{
    private E[] a;
    private int size;

    public MyArrayList()
    {
    	this(10);
    }

    @SuppressWarnings("unchecked")
    public MyArrayList(int initialCapacity)
    {
    	if (initialCapacity < 0)
            throw new IllegalArgumentException();
    	
    	a = (E[]) new Object[initialCapacity];
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public E get(int index)
    {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        return a[index];
    }

    public E set(int index, E element)
    {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();

        E replaced = a[index];
        
        a[index] = element;
        
        return replaced;
    }

    public boolean contains(Object elem)
    {
        for(int i=0; i<size; i++) {
        	if (a[i].equals(elem)) {
        		return true;
        	}
        }
    	
    	return false;
    }

    @SuppressWarnings("unchecked")
    public void trimToSize()
    {
        if (size == a.length) {
        	return;
        }
    	
    	E[] b = a;
        a = (E[]) new Object[size];
        for (int i=0; i<a.length; i++) {
        	a[i] = b[i];
        }
    }

    public boolean add(E elem)
    {
        this.add(size, elem);
    	
    	return true;
    }

    @SuppressWarnings("unchecked")
    public void add(int index, E element)
    {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException();
        
        E[] b = a.clone();
        
        if (index == a.length-1 || a.length==0) {
        	a = (E[]) new Object[b.length*2+1];
        	for (int i=0; i<b.length; i++) {
        		a[i] = b[i];
        	}
        	a[b.length] = element;
        } else {
        	a[index] = element;
        	for (int i=index+1; i<b.length; i++) {
        		a[i] = b[i-1];
        	}
        }
        
        size++;
    }

    public E remove(int index)
    {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        
        E removed = a[index];
        
        for (int i = index; i<size; i++) {
        	a[i] = a[i+1];
        }
        
        size--;

        return removed;
    }

    public boolean remove(Object elem)
    {
        for (int i=0; i<size; i++) {
        	if (a[i].equals(elem)) {
        		this.remove(i);
        		return true;
        	}
        }
    	
    	return false;
    }

    // start package access methods to facilitate automated testing
    // do not modify these methods

    Object[] getA()
    {
        return a;
    }

    void setA(E[] newA)
    {
        a = newA;
    }

    int getSize()
    {
        return size;
    }

    void setSize(int newSize)
    {
        size = newSize;
    }

    // end package access methods to facilitate automated testing
}