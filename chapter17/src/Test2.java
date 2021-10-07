import java.util.Objects;

public class Test2 {
    public static void main(String[] args) {
        User u1 = new User("zhangsan",new Address("北京","大兴区","123456"));
        User u2 = new User("zhangsan",new Address("北京","大兴区","123456"));
        User u3 = new User("zhangsan",new Address("北京","大兴区","125456"));

//        System.out.println(u1.getClass());
        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u3));
    }
}

class User{
    //用户名
    String name;
    //用户地址
    Address addr;

    public User() {
    }

    public User(String name, Address addr) {
        this.name = name;
        this.addr = addr;
    }

    //重写equals方法
    //重写规则：当一个用户的用户名和家庭住址都相同，表示同一个用户
    //这个equals判断的是User对象和User对象是否相等
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof User)) return false;
        if(this == obj) return true;
        User u = (User) obj;
        return this.name.equals(u.name) && this.addr.equals(u.addr);
    }


/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(addr, user.addr);
    }*/


}

class Address{
    String city;
    String street;
    String zipcode;

    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    //注意：这里没有重写equals方法
    //这里的equals方法判断的是：Address对象和Address对象是否相等


/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(street, address.street) &&
                Objects.equals(zipcode, address.zipcode);
    }*/
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null || !(obj instanceof Address))  return false;
        Address a = (Address) obj;
        return this.city.equals(a.city) &&
                this.street.equals(a.street) &&
                this.zipcode.equals(a.zipcode);

    }

}