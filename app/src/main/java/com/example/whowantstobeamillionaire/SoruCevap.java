package com.example.whowantstobeamillionaire;

import java.util.Random;

public class SoruCevap {
   public static int sayac=0;



    public String[] Sorular;
    {
        Sorular = new String[31];
        Sorular[0]="1 Milyon TL'lik soruyu bilir ve ödemenizi 200'lük banknotlar halinde alırsanız yaklaşık kaç kilogramlık ağırlık taşımak zorunda kalacaksınız?";
        Sorular[1]="Hangisi para üzerine resmi basılan bilinen ilk gerçek kişidir?";
        Sorular[2]="Guinness Dünya Rekorları’na göre, tarihte bir kadının doğurduğu en yüksek çocuk sayısı kaçtır?";
        Sorular[3]="Soğuk Savaş döneminde, ABD “West Ford Projesi” adıyla dünyanın yörüngesine hangi nesneden 350 milyon adet yerleştirmiştir?";
        Sorular[4]="Formik aside adını veren formika latincede hangi hayvandır?";
        Sorular[5]="Kendisini kaçıran korsanların ailesinden istediği fidyeyi az bulup fidyeyi artırmalarını isteyen, serbest kalınca da korsanları yakalayıp çarmıha geren kişi kimdir?";
        Sorular[6]="İnsanlarla diyalog kurarak yeni bilgileri öğrenmek üzere tasarlanan robot “Kirobo”, görevlilerin “Noel Baba’dan ne istersin?” sorusuna ne yanıt vermiştir?";
        Sorular[7]="Hangi hayvan, yavru köpekleri kaçırıp, evcil hayvan olarak besleyip, bekçi köpeği olarak kullanır?";
        Sorular[8]="1959 yazında valilik büyük bir kampanya başlatarak İstanbulluların her pazartesi 13:00–14:00 arasında ne yapmalarını istemiştir?";
        Sorular[9]="Avustralya’daki özel bir hastane, kurulduğu günden beri 3 milyondan fazla kişiye hangi hizmeti vermektedir?";
        Sorular[10]="“Kahve” Osmanlı'ya gelmeden önce, “kahverengi” nasıl adlandırılırdı?";
        Sorular[11]="Heredot’un yazdığı, Mısır firavununun dilin kökeni deneyinde, doğunca çobana verilerek kapatılan, o dahil kimseyle konuşturulmayan çocuğun söylediği ilk kelime nedir?";
        Sorular[12]="Bir işin uygun ve kolay olduğunu belirtmek için hangisi söylenir?";
        Sorular[13]="Atasözüne göregönülden de ırak olan kimdir?";
        Sorular[14]="Yunan mitolojisinde Eros ok atarak insanların birbirlerine hangisini hissetmesini sağlar?";
        Sorular[15]="Bu programı kim yaptı";
        Sorular[16]="Hangisi, bazı futbol takımlarının, taraftarları için kullandıkları bir ifadedir?";
        Sorular[17]="Horozu çok olan köyde şeklinde başlayan atasözünün devamını nasıldır";
        Sorular[18]="Sosyal medyada, kısa sürede ve kolayca takipçi kazanmak isteyenlerin uyguladığı klişe taktik hangisidir?";
        Sorular[19]="'Gıpgıcır' ne anlama gelir";
        Sorular[20]="Trafikte hangi araçların arkasında Dolu ya da Boş yazar?";
        Sorular[21]="Kumaşın kenarına tığ ile işlenen, eski evlerde sıkça görülen, giysi ve örtülerde kullanılan örgüye ne ad verilir?";

        Sorular[22]="Bir insanın hastalığı ne olursa olsun, iyi gelmesi için klişe olarak hangisi pişirilir?";
        Sorular[23]="Dedesiyle dağda yaşayan, arkadaşı Peter ile mutlu günler geçiren, daha sonra yayınlanan kitapta Peter ile evlenen çizgi film karakteri kimdir?ı";
        Sorular[24]="Eski bir Türk masalına adını veren gülen ayva ile birlikte ağlayan meyve hangisidir?";
        Sorular[25]="Geçtiğimiz günlerde vizyona giren Peter Jackson'ın yönettiği \"The Hobbit\" serisinin son filminin adı nedir?";
        Sorular[26]="Kurtuluş Savaşı'nda cephede Mustafa Kemal'in yanında onbaşı rütbesiyle görev alan, Mor Salkımlı Ev romanının yazarı kimdir";
        Sorular[27]="Güneşte veya hafif alevde kurutulmuş ete ne ad verilir";
        Sorular[28]="Medeni Kanunumuza göre vasiyetname hazırlayabilmek içinkaç yaşını doldurmak gerekmektedir?";

        Sorular[29]="Düdük futbol maçlarında kullanılmadan önce hakemler hangisini kullanırlardı?";
        Sorular[30]="Çilek, portakal, muz gibi meyvelerle yapılan, pastaların üstüne konarak damakta güzel bir tat bırakan şeffaf tatlı hangisidir?";
    }

    String[] Cevaplar;

    {
        Cevaplar = new String[31];
        Cevaplar[0]="5.5 kg";
        Cevaplar[1]="Büyük İskender";
        Cevaplar[2]="69";
        Cevaplar[3]="Bakır İğne";
        Cevaplar[4]="Karınca";
        Cevaplar[5]="Jül Sezar ";
        Cevaplar[6]="Oyuncak roket istiyorum";
        Cevaplar[7]="Babun";
        Cevaplar[8]="Karasinek Avlamalarını";
        Cevaplar[9]="Oyuncak bebek tamiri";
        Cevaplar[10]="Fındık Rengi ";
        Cevaplar[11]="Ekmek";
        Cevaplar[12]="Dişime göre";
        Cevaplar[13]=" Gözden ırak olan";
        Cevaplar[14]="Aşk";
        Cevaplar[15]="Furkan & Serdar ";//
        Cevaplar[16]="12. Adam";
        Cevaplar[17]="Sabah geç olur";
        Cevaplar[18]="Takibe takip";
        Cevaplar[19]="Yepyeni";
        Cevaplar[20]="Akaryakıt Tankeri";
        Cevaplar[21]="Dantel";
        Cevaplar[22]="Çorba";
        Cevaplar[23]="Heidi";
        Cevaplar[24]="Nar";
        Cevaplar[25]="Beş Ordunun Savaşı";
        Cevaplar[26]="Halide Edip Adıvar";
        Cevaplar[27]="Kadit";
        Cevaplar[28]="15";
        Cevaplar[29]="Beyaz Mendil";
        Cevaplar[30]="Jöle";

    }

    String[] Y_cevaplar;

    {
        Y_cevaplar = new String[95];
        Y_cevaplar[0]="50 kg";
        Y_cevaplar[1]="500 kg";
        Y_cevaplar[2]="5000 kg";

        Y_cevaplar[3]="Kleopatra";
        Y_cevaplar[4]="Abraham Lincoln";
        Y_cevaplar[5]="Yunus Emre";

        Y_cevaplar[6]="25";
        Y_cevaplar[7]="94";
        Y_cevaplar[8]="55";

        Y_cevaplar[9]="Tahta Sopa";
        Y_cevaplar[10]="Demir Tel";
        Y_cevaplar[11]="Çivi";

        Y_cevaplar[12]="Ayı";
        Y_cevaplar[13]="At";
        Y_cevaplar[14]="Yılan";

        Y_cevaplar[15]="Atilla";
        Y_cevaplar[16]="Yıldırım Beyazıt";
        Y_cevaplar[17]="Büyük İskender";

        Y_cevaplar[18]="Para istiyorum";
        Y_cevaplar[19]="Oyuncak ayı istiyorum";
        Y_cevaplar[20]="Büyümek İstiyorum";

        Y_cevaplar[21]="Tilki";
        Y_cevaplar[22]="Kurt";
        Y_cevaplar[23]="Koala";

        Y_cevaplar[24]="Çöp Toplamalarını";
        Y_cevaplar[25]="Uyumalarını";
        Y_cevaplar[26]="Dışarıya çıkmamalarını";

        Y_cevaplar[27]="Antika telefon tamiri";
        Y_cevaplar[28]="Saat tamiri";
        Y_cevaplar[29]="Dolma kalem tamiri";

        Y_cevaplar[30]="Telve Rengi";
        Y_cevaplar[31]="Ayı rengi";
        Y_cevaplar[32]="Tarçın rengi";

        Y_cevaplar[33]="Para";
        Y_cevaplar[34]="Yalan";
        Y_cevaplar[35]="Sevda";

        Y_cevaplar[36]="Kafama göre";
        Y_cevaplar[37]="Bana göre";
        Y_cevaplar[38]="Elime göre";

        Y_cevaplar[39]="Dilden ırak olur";
        Y_cevaplar[40]="Destan olur";
        Y_cevaplar[41]="Kalpte yara olur";

        Y_cevaplar[42]="Nefret";
        Y_cevaplar[43]="Korku";
        Y_cevaplar[44]="Acı";

        Y_cevaplar[45]="Microsoft";
        Y_cevaplar[46]="Google";
        Y_cevaplar[47]="Facebook";

        Y_cevaplar[48]="Yardımcı eleman";
        Y_cevaplar[49]="Canlı DEstek";
        Y_cevaplar[50]="Yedek Kuvvet";

        Y_cevaplar[51]="Sabah erken olur";
        Y_cevaplar[52]="Akşam geç olur";
        Y_cevaplar[53]="Akşam erken olur";

        Y_cevaplar[54]="Atara atar gidere gider";
        Y_cevaplar[55]="Omuz Omuza";
        Y_cevaplar[56]="Göze göz dişe diş";

        Y_cevaplar[57]="Tozpembe";
        Y_cevaplar[58]="Sapsarı";
        Y_cevaplar[59]="Çok eski";

        Y_cevaplar[60]="Ögrenci Servisi";
        Y_cevaplar[61]="Harfiyat Kamyonu";
        Y_cevaplar[62]="Yolcu Otobüsü";

        Y_cevaplar[63]="Kanaviçe";
        Y_cevaplar[64]="Fisto";
        Y_cevaplar[65]="Kurdele";

        Y_cevaplar[66]="Mantı";
        Y_cevaplar[67]="Muhallebi";
        Y_cevaplar[68]="Menemen";//************

        Y_cevaplar[69]="Alice";
        Y_cevaplar[70]="Pollyanna";
        Y_cevaplar[71]="Candy";

        Y_cevaplar[72]="Elma";
        Y_cevaplar[73]="Dut";
        Y_cevaplar[74]="Üzüm";//*******

        Y_cevaplar[75]="Beklenmedik Yolculuk";
        Y_cevaplar[76]="Smaug'un Çorak Toprakları";
        Y_cevaplar[77]="Kralın Dönüşü";

        Y_cevaplar[78]="Yakup Kadri Karaosmanoğlu";
        Y_cevaplar[79]="Reşat Nuri Güntekin";
        Y_cevaplar[80]="Nezihe Meriç";

        Y_cevaplar[81]="Fodul";
        Y_cevaplar[82]="Dumur";
        Y_cevaplar[83]="Tirit";

        Y_cevaplar[84]="18";
        Y_cevaplar[85]="21";
        Y_cevaplar[86]="25";

        Y_cevaplar[87]="Gong";
        Y_cevaplar[88]="Şapka";
        Y_cevaplar[89]="Çan";

        Y_cevaplar[90]="Tart";
        Y_cevaplar[91]="Milföy";
        Y_cevaplar[92]="Kup";





    }


    String[] Skor;
    {
        Skor=new String[16];

        Skor[0]="$0";
        Skor[1]="$100";
        Skor[2]="$200";
        Skor[3]="$300";
        Skor[4]="$500";
        Skor[5]="$1000";
        Skor[6]="$2000";
        Skor[7]="$4000";
        Skor[8]="$8000";
        Skor[9]="$16000";
        Skor[10]="$32000";
        Skor[11]="$64000";
        Skor[12]="$125000";
        Skor[13]="$250000";
        Skor[14]="$500000";
        Skor[15]="$1000000";
    }

  /*  public int Rastgelesayi()
    {
        //Random rnd=new Random();
       //int rastgele= rnd.nextInt(2);

        //return rastgele;
    }*/

    public int rastgelesayi(){
        Random rnd=new Random();

        int rastgele= rnd.nextInt(31);


        return rastgele;
    }


    public String SoruGetir(int rastgele)
    {

        String secilenSoru=Sorular[rastgele];
        CevapGetir(rastgele);

        sayac++;

        return secilenSoru;
    }



    public String CevapGetir(int sorusayisi)
    {

        String cevapgotur=Cevaplar[sorusayisi];

        return cevapgotur;
    }




}
