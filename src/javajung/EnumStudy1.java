package javajung;

public class EnumStudy1 {
    enum Transportation{
        BUS(100) {
            @Override
            int fare(int distance) {
                return BASIC_FARE*distance;
            }
        },
        TRAIN(150) {
            @Override
            int fare(int distance) {
                return BASIC_FARE*distance;
            }
        },
        SHIP(100) {
            @Override
            int fare(int distance) {
                return BASIC_FARE*distance;
            }
        },
        AIRPLANE(300) {
            @Override
            int fare(int distance) {
                return BASIC_FARE * distance;
            }
        };

        protected final int BASIC_FARE;

        Transportation(int basicFare) {  // 언제나 private
            BASIC_FARE = basicFare;
        }

        public int getFARE() {
            return BASIC_FARE;
        }

        abstract int fare(int distance);
    }
}