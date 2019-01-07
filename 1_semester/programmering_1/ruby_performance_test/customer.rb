class Customer
  def initialize(name, email, address, yearOfBirth)
    @name = name;
    @email = email;
    @address = address;
    @yearOfBirth = yearOfBirth;
  end

  def hello
    puts "Name: #{ @name }"
    nil
  end
end
