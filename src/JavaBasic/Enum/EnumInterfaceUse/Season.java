package JavaBasic.Enum.EnumInterfaceUse;

/**
 * @author Stephen
 * @date 2021-05-12 06:57
 **/
public enum Season implements EnumInterface {
    SPRING {
        @Override
        public void show() {
            System.out.println("Spring");
        }
    },

    SUMMER {
        @Override
        public void show() {
            System.out.println("Summer");
        }
    },

    AUTUMN {
        @Override
        public void show() {
            System.out.println("Autumn");
        }
    },

    WINTER {
        @Override
        public void show() {
            System.out.println("Winter");
        }
    };
}
