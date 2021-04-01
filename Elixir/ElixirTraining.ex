defmodule ElixirTraining do

  # Hello world
  def hello do
    IO.puts "Hello World"
  end

  # Double computes the double of a number
    def double(n) do
      n * 2
    end

  # Converts from Fahrenheit to Celsius
    def toCel(f) do
      ((f-32)/1.8)
    end

  # Calculates the area of a rectangle given the length of the two sides
    def areaRect(a,b) do
      a*b
    end

  # Calculates the area of a square given length of one side
    def areaSqr(a) do
      a*a
    end

  # Calculates the area of a circle given the radius
    def areaCirc(r) do
      :math.pi()*:math.pow(r,2)
    end

    # Balance in a tree (Returns the depth and impalance ot the tree, where impalance is the difference in depth of the trees branches)
    def balance(:nil) do {0,0} end
    def balance({:node, _, left, right}) do
      {depl,ball} = balance(left)
      {depr,balr} = balance(right)
      {max(depl,depr)+1, max(max(ball,balr),abs(depl-depr))}
    end

    # Mirrors a tree
    def mirror(:nil) do :nil end
    def mirror({:tree, value, left, right}) do
      {:tree, value, mirror(right), mirror(left)}
    end

    # Simple product calculation of two numbers
    def prod(n, m) do
        cond do
          n==0 -> 0
          n>0 -> prod(n-1,m) + m
          n<0 -> prod(n+1,m) - m
        end
      end
    end

    # Queue
    def new() do {:queue, [], []} end
    def enqueue(elem, {:queue, first, last}) do {:queue, first, [elem|last]} end
    def dequeue({:queue, [], []}) do :fail end
    def dequeue({:queue, [], last}) do
      dequeue({:queue, :lists.reverse(last), []})
    end
    def dequeue({:queue, [h|t], last}) do
      {:ok, h, {:queue, t, last}}
    end

    def app_queue({:queue, first, last}, {:queue, first2, last2}) do
      {:queue, :lists.append(first,:lists.reverse(last)), :lists.append(first2,:lists.reverse(last2))}
    end

    # Implemented push and pop
    def push(stack, elem) do [elem|stack] end

    def pop([]) do {:no} end
    def pop([h|t]) do {:ok, h, t} end

end
