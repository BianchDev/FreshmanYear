/*
     *  @author Nick Bianchi
     */

import java.lang.reflect.Array;
import java.util.List; 

public class MyArrayList<T> implements ListInterface<T>
{
	private int size; 
	private T[] arr; 
	
	 public MyArrayList() {
	        this.arr = (T[]) new Object[DEFAULT_CAPACITY];
	        this.size = 0;
	    }
	
	@Override
	public void add(T t) 
	{
		if(arr.length <= size)
		{
			T[] temp = (T[]) new Object[arr.length + 1]; 
				for (int i = 0; i < arr.length; i++)
				{
					temp[i] = arr[i]; 
				}
			arr = temp;
		}
			arr[size] = (T)t; 
			size++; 
		
	}

	@Override
	public T get(int pos) throws MyIndexOutOfBoundsException, ArrayIndexOutOfBoundsException 
	{
		if (pos < 0 || pos > size)
		{
			throw new MyIndexOutOfBoundsException("Element does not exist"); 
		}
		
		if (arr.length < pos)
		{
			throw new ArrayIndexOutOfBoundsException("Position larger than array size");
		}
		if (arr[pos] != null)
		{
			return arr[pos]; 
		}
		return arr[pos];
	}

	@Override
	public boolean remove(T t) 	
	{
		for(int i = 0; i < size; i++)
		{
				if(arr[i].equals(t))
				{
					remove(i); 
					return true;
			}
		}
		return false; 

	}

	@Override
	public void remove(int pos) throws MyIndexOutOfBoundsException, ArrayIndexOutOfBoundsException 
	{
		if (pos < 0 || pos > size)
		{
			throw new MyIndexOutOfBoundsException("Element does not exist"); 
		}
		
		if (arr.length < pos)
		{
			throw new ArrayIndexOutOfBoundsException("Position larger than array size");
		}
		for (int i = pos; i < size-1; i++) 
		{
			arr[i] = arr[i + 1]; 
		}
		size--; 
		
	}

	@Override
	public void add(int pos, T t) throws MyIndexOutOfBoundsException, ArrayIndexOutOfBoundsException 
	{
		if (pos < 0 || pos >= size)
		{
			throw new MyIndexOutOfBoundsException("Element does not exist"); 
		}
		if (arr.length <= pos)
		{
			throw new ArrayIndexOutOfBoundsException("Position larger than array size");
		}
		if (size >= arr.length)
		{
			T[] temp = (T[]) new Object[size + 1];
			for(int i = 0; i < arr.length; i++)
			{
				temp[i] = arr[i]; 
			}
			arr = temp; 
		}
		for(int i = size; i >= pos; i--) 
		{
			this.arr[i] = arr[i - 1]; 
		}
		this.arr[pos] = t;
		size++; 
	}

	@Override
	public void set(int pos, T t) throws MyIndexOutOfBoundsException, ArrayIndexOutOfBoundsException 
	{
		if (pos < 0 || pos > size)
		{
			throw new MyIndexOutOfBoundsException("Element does not exist"); 
		}
		
		if (size < pos)
		{
			throw new ArrayIndexOutOfBoundsException("Position larger than array size");
		}
		
		if (arr[pos] != null)
		{
			arr[pos] = t; 
		}
	}


	@Override
	public boolean contains(T t) 
	{
		for (int k = 0; k < size; k++)
		{
			if (arr[k] == t)
			{
				return true; 
			}
		}
		return false; 
	}

	@Override
	public int size() 
	{
		 
		 return size;

	}

	@Override
	public void clear() 
	{
		T[] temp = (T[]) new Object[size];
		size = 0; 
		
		arr = temp; 
	}

	@Override
	public boolean isEmpty() 
	{
		if (size <= 0)
		{
			return true; 
		}
		return false; 
	}

}
