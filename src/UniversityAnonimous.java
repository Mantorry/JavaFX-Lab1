public class UniversityAnonimous {
    public interface University {
        public void set();
        public void get();
    }
    public static void main(String[] args) {
        University Facultys = new University() {
            int idFaculty;
            String NameFaculty, ShortNameFaculty;

            @Override
            public void set(){
                this.idFaculty = 1;
                this.NameFaculty = "Компьютерные технологии и информационная безопасность";
                this.ShortNameFaculty = "КТиИБ";
            }
            @Override
            public void get() {
                System.out.println("ID: "+ idFaculty + "\nНазвание факультета: "
                        + NameFaculty + "\nАббревиатура: " + ShortNameFaculty);
            }

        };
        University Chairs = new University() {
            int idChair, idFaculty, Code;
            String NameChair, ShortNameChair;
            @Override
            public void set() {
                this.idChair = 1;
                this.idFaculty = 1;
                this.Code = 3;
                this.NameChair = "Информационные системы и технологии в бизнесе";
                this.ShortNameChair = "ИСТ";
            }
            @Override
            public void get() {
                System.out.println("ID: " + idChair + "\nID факультета: "
                        + idFaculty + "\nНазвание кафедры: " + NameChair
                        + "\nАббревиатура: " + ShortNameChair);
            }
        };
        University Posts = new University() {
            int idPost;
            String NamePost;
            @Override
            public void set() {
                this.idPost = 1;
                this.NamePost = "Зав.Кафедры";
            }
            @Override
            public void get() {
                System.out.println("ID: " + idPost + "\nДолжность: " + NamePost);
            }
        };
        University Teachers = new University() {
            int idTeacher, idChair, idPost;
            String FirstName, SecondName, LastName, Email, Phone;
            @Override
            public void set() {
                this.idTeacher = 1;
                this.idChair = 1;
                this.idPost = 1;
                this.FirstName = "Сергей";
                this.SecondName = "Щербаков";
                this.LastName = "Михайлович";
                this.Phone = "88005553535";
                this.Email = "Почта@mail.ru";
            }
            @Override
            public void get() {
                System.out.println("ID: " + idTeacher + "\nID кафедры: " + idChair
                        + "\nID должности: " + idPost + "\nФИО: " + SecondName + " "
                        + FirstName + " " + LastName + "\nНомер телефона: "
                        + Phone + "\nПочта: " + Email);
            }
        };
        System.out.println("-----Факультеты-----");
        Facultys.set();
        Facultys.get();
        System.out.println("\n-----Кафедры-----");
        Chairs.set();
        Chairs.get();
        System.out.println("\n-----Должности-----");
        Posts.set();
        Posts.get();
        System.out.println("\n-----Преподаватели-----");
        Teachers.set();
        Teachers.get();
    }
}
