	package racingcar;

	public class Car {
		private final String name;
		private final Position position;
		public Car(String name) {
			this(name, 0);
		}

		public Car(String name, int position) {
			if(name.length() == 0 || name.isEmpty()) {
				throw new IllegalArgumentException("차 이름은 빈값을 넣을 수 없습니다.");
			}

			if(name.length() > 5) {
				throw new IllegalArgumentException("차 이름의 길이를 5자를 초과할 수 없습니다.");
			}

			this.name = name;
			this.position = new Position(position);
		}

		public void move(MoveStrategy moveStrategy) {
			if(moveStrategy.movable()) {
				position.add();
			}
		}

		public Position getPosition() {
			return this.position;
		}
	}
