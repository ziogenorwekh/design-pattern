package composite;

// 폴더와 파일을 동일한 타입으로 처리하기 위함
public abstract class Unit {
    private String name;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "name='" + name + '\'' +
                '}';
    }

//    파일과 폴더에서 얻는 용량이 다르기 때문,
//    폴더는 파일들의 용량을 합한 것이기 때문이다.
    public abstract int getSize();
}
