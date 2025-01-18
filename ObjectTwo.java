// Ekta class banabo, ebong er moddhe non static function banabo..
// ei non static function ke aro 2 vabe bola zay...
// 1. Instance member variable
// 2. Non static
// 3. Object member variable


// java er ketre access specifier 4 doroner: 1. Public , 2. Private, 3. Protected, 4. Default. 
// kuno access specifier na likai holo default. default & public pray same. tobe public er power besi.. 

class Mahesh {
    // java te int declare korle By default sekane 0 thake.. c/c++ e garbase value
    // chilo..
    int x; // instance/object member variable  default access specifier
    int y; // instance/object member variable

    void fun1() // instance/object member function
    {
        System.out.println("fun1");
    }

    void fun2() // instance/object member function
    {
        System.out.println("fun2");
    }
}

// ekhon ei non static function k call korar jonne class name + dot(.) use korle
// hobe na. Borong ekhane class er object toiri korte hobe..
// Object er syntex:---
// class_name object_name=new class_name();

// Mahesh e1=new Mahesh();
// e1=new Mahesh();
// erokom dile duita object toiry hobe, karon duita new. tokon e1 diye 2nd
// banano object k reffer korbe. and 1st object ta kichukkon por automatic
// delete hoye zabe Garbase Collector diye...
// erpor oi object name dot(.) diye oi function guluke access korbo...


class ObjectTwo {
    public static void main(String[] args) {
        Mahesh m1 = new Mahesh();
        Mahesh m2 = new Mahesh();
        m2.y=5;
        System.out.println("Hello");
        System.out.println(m1.x);
        System.out.println(m2.y);

    }
}