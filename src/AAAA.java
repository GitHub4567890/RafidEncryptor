public class AAAA {
    public static void main(String[] args) {
        Encryptor e = new Encryptor(3,4);
        System.out.println(e.encryptMessage("What are you doing next weekend?"));
        e = new Encryptor(6,5);
        System.out.println(e.encryptMessage("This one time I was trying to do a handstand and fell backwards and landed on my shoe. It hurt! I won't try that again."));
        e = new Encryptor(3,2);
        System.out.println(e.decryptMessage("Ti hsiscn ofietdnia!Bl e nto helo okotAu!A"));
        e = new Encryptor(5,5);
        System.out.println(e.decryptMessage("Tite hsocmi presa es  stsaneregtd see J  nfaBidomonee  d ftm.cuhe alisBr,ssaieecgllstelft!  -rAwsduA"));
        e = new Encryptor(6,5);
        System.out.println(e.decryptMessage("Meottai ooufdsl rtdcsrnelh e r etWwht hhiihmselgro.nlhen    sld tmc egoehsne  otttcbous oacHusAAkoloAA?ploAA eynAA f !AA"));
        e = new Encryptor(9,8);
        System.out.println(e.decryptMessage("Io ihscnongeoesofn rnn  do.cac poir rprirfnmTyhyso gahpyp ce tit,tteniis  siea o,pc gpttr rotirihmkonhneoeancveasn toee le iiwsro nononstrrtffn atttencxlseoe oitl x rfwp.yptanonh ,l,nar eI a  tmardoiiai stennnlvk ealyit real  zid rcaaaeeeatkinudsc e ndt  icxtt hpcpitoeaoaahp  xcrrnehbptceo tc t  sriird pisinoyoirn gfnpetettio.tssvehnr i eereamEonlnf lannoftert eetoite tl  unondhlctltrceeioode.en gn -r  iiitabcFbenbe eeoustlnw pr annn  patlsc uusne ,rsssedcr ycueuoheaphasdmnantel o is imla-ecoeoey rnc eyoIsotrkr rts  yeaai idtpytntibeht e hslceigdam er oe l.p ymnnbg otpests  r-dtshstb d iaoehuaeeoguset snnets ,wic   ik egrswpneflnyciogyolephesearsi dmi te lr.edcisale ,eooonsqA rmnud uncapar ai obulcsrranlt ekeeut naceehrhrtsr  eooe iymw vrcclpeikiiiaytstedzpn  shyeei dta  ddeeehgtp brribthuAyi puoosA gtit reAtioe uirAhn nnnzsAeartoae.A testudAAooc  t AA"));
        e = new Encryptor(4,3);
        System.out.println(e.encryptMessage("The person who decrypted this puts the milk before their cereal."));
        e = new Encryptor(3,2);
        System.out.println(e.decryptMessage("Flxei i oscolgy uA"));
        e = new Encryptor(2,3);
        System.out.println(e.decryptMessage("MeaHy la itrnseta rwmW eltltlei  .v3W e0hI 8i a NA  erLAgralronbayeu o,qu,M,e e rNx8qei7uwc1e o04sye.  s icsTsoih noimfn.own uagI't frct ehhy iis,pl  rytIo a'bdpmaee baddbb,eyr r omemtudyhr  eraka-w di SenHcr-ah.lnrA"));

    }
}