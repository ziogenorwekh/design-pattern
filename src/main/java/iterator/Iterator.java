package iterator;

public interface Iterator {
    // Aggregator의 다음 구성 데이터를 얻을 수 있도록 한다.
    boolean next();

//    구성 데이터를 하나 얻어 반환한다.
//    구성 데이터 타입은 정해지지 않았으므로 Object 타입이다.
    Object current();
}
