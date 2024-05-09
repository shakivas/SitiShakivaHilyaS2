package com.example.sitishakivahilyas3;

import java.util.ArrayList;

public class FoodsData {
    private static String[] foodsNames = {
            "Cannoli Siciliani",
            "Fettuccine Alfredo With Shrimp",
            "Pizza Margherita",
            "Lasagna",
            "Bruschetta",
            "Ravioli",
            "Risotto",
            "Panini",
            "Gelato",
            "Tiramisu"
    };
    private static String[] foodsDetails = {
            "Cannoli Siciliani adalah cangkang kue berbentuk silinder yang digoreng, diisi dengan ricotta kocok manis yang dicampur dengan manisan citron dan coklat parut. Ukuran dan isiannya bervariasi di berbagai bagian Sisilia. Yang paling menonjol, ada yang dengan isian ricotta coklat hitam kental yang dibuat oleh koki pastry di Messina. Cannoli dihias dengan berbagai cara: dengan pistachio cincang, manisan kulit jeruk, manisan ceri, atau coklat.",
            "Fettuccine Alfredo With Shrimp adalah sebuah hidangan pasta Italia yang terbuat dari fettuccine yang dicampur dengan mentega dan keju Parmesan (bahasa Italia: pasta al burro e parmigiano) ditambah dengan udang yang empuk.",
            "Pizza Margherita adalah pizza khas Neapolitan, berbentuk bulat dengan tepi terangkat (cornicione) dan dihias dengan tomat kupas yang dihaluskan dengan tangan, mozzarella (buffalo mozzarella atau fior di latte), daun kemangi segar, dan minyak zaitun extra virgin. Adonannya dibuat dengan mencampurkan air, garam dan ragi (penghuni pertama, ragi bir segar atau kering) dengan tepung",
            "Lasagna adalah sejenis pasta, mungkin salah satu jenis pasta tertua, terbuat dari lembaran datar yang sangat lebar. Istilah mana pun dapat merujuk pada hidangan Italia yang terbuat dari tumpukan lapisan lasagna yang diselingi dengan isian seperti ragù (daging giling dan saus tomat), saus béchamel, sayuran, keju (yang mungkin termasuk ricotta, mozzarella, dan Parmesan), serta bumbu dan rempah-rempah. . Hidangan ini mungkin diberi taburan keju parut, yang meleleh saat dipanggang. Biasanya pasta yang dimasak dirangkai dengan bahan lainnya dan kemudian dipanggang dalam oven.",
            "Bruschetta  antipasto di kawasan Italia yang pertama kali ditemukan pada abad ke-15. Bahan utama makanan ini ialah roti. Bahan utamanya adalah roti yang dipanggang, bawang putih, minyak zaitun, garam, dan lada.",
            "Ravioli adalah jenis pasta yang terdiri dari isian yang diselimuti adonan pasta tipis. Biasanya disajikan dalam kaldu atau dengan saus, mereka berasal sebagai makanan tradisional dalam masakan Italia. Ravioli umumnya berbentuk bujur sangkar, meskipun bentuk lain juga digunakan, termasuk lingkaran dan setengah lingkaran (mezzelune).",
            "Risotto adalah hidangan nasi campur khas Italia Utara, yaitu beras yang dimasak dengan kaldu sehingga lengket menyerupai krim. Kaldu yang digunakan dapat berasal dari daging, ikan, atau sayuran. Banyak jenis risotto mengandung mentega, keju, anggur, dan bawang. Risotto adalah cara paling lazim memasak nasi di Italia.",
            "Panini adalah roti lapis yang berasal dari Italia. Dan biasanya panini menggunakan roti utuh yang dipanggang, bukan roti yang dipotong. Jenis roti yang biasa digunakan untuk membuat panini antara lain baguette, ciabatta, rosetta, dan michetta. Roti kemudian dipotong secara horizontal dan biasanya diisi dengan irisan daging olahan seperti salami, mortadella ataupun prosciutto beserta dengan keju, irisan tomat dan tuna.Dan biasanya panini disajikan hangat setelah dipanggang menggunakan mesin press khusus yang disebut panini press.",
            "Gelato  adalah es krim khas dari negara Italia. Nama gelato berasal dari bahasa Italia yang artinya \"beku\". Gelato terbuat dari bahan utama seperti susu, krim, dan gula. Kemudian diberi tambahan variasi rasa mulai dari buah-buahan, kacang, dan bahan perasa lainnya. Apabila dibandingkan dengan es krim pada umumnya, Gelato memiliki kandungan lemak yang lebih rendah. Gelato biasanya mengandung sedikit udara dan memiliki lebih banyak varian rasa daripada makanan penutup beku lainnya, memberikan kepadatan dan kekayaan rasa yang membedakannya daripada es krim lainnya.",
            "Tiramisu adalah makanan penutup Italia yang terbuat dari kue ladyfinger (savoiardi) yang dicelupkan ke dalam kopi, dilapisi dengan campuran telur, gula, dan mascarpone, serta dibumbui dengan coklat. Resepnya telah diadaptasi menjadi banyak jenis kue dan makanan penutup lainnya. Asal usulnya masih diperdebatkan antara wilayah Italia di Veneto dan Friuli-Venezia Giulia."
    };
    private static int[] foodsImages = {
            R.drawable.cannoli_siciliani,
            R.drawable.fettuccine,
            R.drawable.margherita_pizza,
            R.drawable.lasagna,
            R.drawable.bruschetta,
            R.drawable.ravioli,
            R.drawable.risotto,
            R.drawable.panini,
            R.drawable.gelato,
            R.drawable.tiramisu
    };

    static ArrayList<Foods> getListData() {
        ArrayList<Foods> list = new ArrayList<>();
        for (int position = 0; position<foodsNames.length; position++){
            Foods foods = new Foods();
            foods.setName(foodsNames[position]);
            foods.setDetail(foodsDetails[position]);
            foods.setPhoto(foodsImages[position]);
            list.add(foods);
        }
        return list;
    }
}
