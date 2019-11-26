package com.learningapp.tri.quiz.wrapperDataBase;

public class AppRoads {
    String [][] UnixRoads;

    public String[][] CCCNARoads(){
        String[][] answers = {


//1
                {"ACL standard","ACL générale","ACL étendues","ACL complète"},
//2
                {"ACL complète","ACL étendues","ACL générale","ACL standard"},
//3
                {"OSPF","HDLC","RIP","NTP"},
//4
                {"Réseaux","Application","Liaison de données","Physique"},
//5
                {"Standardisé","Propriétaire CISCO","Les deux","Rien !"},
//6
                {"Numéro de system autonome","Adresse IP de destination","Adresse IP de source","----"},
//7
                {"Une valeur important","Les nombres de circuit virtuel","Un circuit virtuel sur un équipement situé à une extrémité","Les nombre de routeurs pour chaque liaison "},
//8
                {"Protocole d’authentification","Protocole de routage","Les deux","-----"},
//9
                {"OSPF","RIP","IGRP et EGRP","Les trois"},
//10
                {"OSPF","RIP","IGRP et EGRP","Les trois"},
//11
                {"à état de lien","à vecteurs distance","les deux","OSPF n’est pas un protocole de routage"},
//12
                {"Hello packet","Database Description packets (DBD)","Link-state Acknowledgement packets (LSAck)","Link-state request packets (LSR)"},
//13
                {"DHCPREQUEST->DHCPOFFER->DHCPDISCOVER->DHCPACK","DHCPOFFER->DHCPDISCOVER->DHCPREQUEST->DHCPACK","DHCPDISCOVER->DHCPOFFER->DHCPREQUEST->DHCPACK","DHCPACK->DHCPOFFER->DHCPREQUEST->DHCPDISCOVER"},
//14
                {"Effacez les configurations DHCP","Bloque une adresse client","Exclusion d'adresses IPv4","Débloque une adresse client"},
//15
                {"Protocole propriétaire de Cisco","Protocole propriétaire de HP","Protocole propriétaire de Cisco et HP","Protocole standardisé"},
//16
                {"Protocole propriétaire de Cisco","Protocole propriétaire de HP","Protocole propriétaire de Cisco et HP","Protocole standardisé"},
//17
                {"Vrais","Faux","----","----"},
//18
                {"Collecter des informations","l’accès à l’internet","D’augmenter les capacités de vitesse de liaisons agrégées ","pas de but !"},
//19
                {"Configurer un Routeur automatiquement","Efface les routes de la table de routage","Segmenter un réseau et améliorer les performances.","Permit de ne faire rien"},
//20
                {"Définissez le port en mode d’accès","Cherche le VLAN root","Indiquer un VLAN natif","Passez en mode de configuration global"},
//21
                {"Starting TCP Protocol","Subneting Tour Protocol","Spanning Tree Protocol","----"},
//22
                {"Envoyées à tous les ports de commutation","Envoyées à port d'entrée initial","Envoyées à tous les ports de commutation, excepté au port d'entrée initial","Envoyées à tous les ports d’internet"},
//23
                {"Le commutateur arrêté","Toute la bande passante disponible est consommée","Tous les ports est utilisé","La configuration de commutateur est perdu"},
//24
                {"Un identifiant unique que les clients sans fil utilisent","Un mot de passe de point d’accès","Le numéro de PIN d’un point d’accès","L’adesse MAC de client"},
//25
                {"ID de routeur","méthode d'authentification","Adresse privé","Adresse MAC"},
//26
                {"NAT dynamique","PAT","NAT statique","Les trios"},
//27
                {"Un protocole de tunneling VPN de site à site","Un sous-protocole d’OSPF","Un protocole de routage à vecteur de distance.","Un protocole de routage a état de lien."},
//28
                {"NAT statique","NAT dynamique","PAT","Les trios"},
//29
                {"est associé à VLAN 1","est associé à VLAN 11","est associé à VLAN  17","n'est associé à aucun VLAN"},
//30
                {"Bloque la négociation de trunk.","gère la négociation des routeurs.","gère la négociation de trunk.","Les trois."},
//31
                {"Access, Authorization, and Accounting.","Authentication, Access, and Accounting.","Authentication, Authorization, and Access.","Authentication, Authorization, and Accounting."},
//32
                {"les vers","Un virus","spayware","adware"},
//33
                {"Un virus","spyware","adware","les vers"},
//34
                {"Un virus","les vers","spayware","adware"},
//35
                {"Un virus","les vers","adware","spayware"},
//36
                {"Routage","Cryptage","Authentification","Hachage"},
//37
                {"Système d’exploitation","Type de virus","par-feu de stratégie de zone","Type d’attaque"},
//38
                {"le nombre maximal d'adresses IP pour l'interface","le nombre maximal d'adresses physique pour l'interface","le nombre maximal pool d’adresse pour l'interface","le nombre maximal d'adresses MAC sécurisées pour l'interface"},
//39
                {"secure IOS-image  et   secure Files-config","secure boot-image et secure IOS-config","secure CLI-image  et   secure command-config","secure boot-image et  secure boot-config "},
//40
                {"Denial Of System","Direct Of Service","Denial Of Service","Day Of Service"},
        };
        return answers;
    }
    public String[][] ItRoads(){
        String[][] answers = {



/*1*/
                {"un carte vidéo",
                        "le composant principal de l'unité centrale.",
                        "mémoire morte",
                        "Mémoire vive"},
//2
                {"Range Access Memory",
                        "Random Accept Memory",
                        "Row Access Memory",
                        "Random Access Memory"},
//3
                {"définit les règles que doivent suivre les ordinateurs pour communiquer.",
                        "un adaptateur graphique",
                        "est l'élément essentiel d'un PC Gamer",
                        "rein"},
//4
                {"technologie de vérification de connexion.",
                        "un adaptateur graphique",
                        "permet de stocker des données sur plusieurs disques durs en vue d'assurer la redondance.",
                        " rien"},
//5
                {"vrais.",
                        "faux.",
                        "---",
                        "---"},
//6
                {"vrais.",
                        "faux.",
                        "---",
                        "---"},
//7
                {"vrais.",
                        "faux.",
                        "---",
                        "---"},
//8
                {"de 12.0.0.0 à 10.255.255.255",
                        "de 103.0.0.0 à 10.255.255.255",
                        "de 10.0.0.0 à 10.255.255.255",
                        "de 10.60.0.0 à 10.255.255.255"},
//9
                {"de 162.16.0.0 à 172.31.255.255",
                        "de 172.16.0.0 à 172.31.255.255",
                        "de 122.16.0.0 à 172.31.255.255",
                        "de 72.16.0.0 à 172.31.255.255"},
//10
                {"de 182.168.0.0 à 192.168.255.255",
                        "de 172.168.0.0 à 192.168.255.255",
                        "de 192.168.0.0 à 192.168.255.255",
                        "de 193.168.0.0 à 192.168.255.255"},
//11
                {"redémarrer l’ordinateur ",
                        "afficher toutes les information de configuration de toutes les cartes réseaux .",
                        "effacer un dossier",
                        "----"},
//12
                {"HDD",
                        "SDD",
                        "les deux",
                        "rien"},
//13
                {"33",
                        "7",
                        "9",
                        "11"},
//14
                {"10",
                        "5",
                        "0",
                        "A"},
//15
                {"1000",
                        "1024",
                        "1048",
                        "2048"},
//16
                {"1.000.000",
                        "1.048.576.000",
                        "1.073.741.824",
                        "1.024.024.024"},
//17
                {"AZERTY",
                        "QWERTY",
                        "Type 12",
                        "Type 02"},
//18
                {"Une mise à jour",
                        "Le chargement d'un fichier informatique vers un autre ordinateur",
                        "Un diplôme d'informaticien",
                        "Un système d’exploitation"},
//19
                {"Le fichier autoexec.bat",
                        " Le fichier win.ini",
                        "La base de registre",
                        "La base de composants de windows"},
//20
                {"IDE",
                        "SCSI",
                        "RAID",
                        "---"},

//21
                {"Formater le disque",
                        "Le partitionner",
                        "Le partager",
                        "---"},

//22
                {"Le contrôle des données",
                        "la protection contre le piratage",
                        "la performance",
                        "---"},
//23
                {"ROM",
                        "RUM",
                        "RAM",
                        "---"},
//24
                {"Le secteur",
                        "Le cluster",
                        "La FAT",
                        "Le block"},
//25
                {"peut bloquer les intrusions sur votre ordinateur",
                        "vous protège des virus",
                        "peut interdire l’accès à certains sites",
                        "---"},
//26
                {"IEEE 802.11b",
                        "IEEE 802.13b",
                        "IEEE 1394b",
                        "IEEE 1349b"},
//27
                {"Token Ring",
                        "Etoile",
                        "Backbone",
                        "---"},
//28
                {"169.36.125.0",
                        "1.2.3.4",
                        "147.126.256.9",
                        "---"},
//29
                {"La quantité de données maximale transmissible par unité de temps",
                        "La quantité de données maximale transmise par unité de temps",
                        "La quantité de données minimale transmissible par unité de temps",
                        "---"},
//30
                {"rien",
                        "vérifier le temps de réponse d'une machine distante",
                        "connaître le chemin pour atteindre une machine distante",
                        "---"},
//31
                {"FTP",
                        "TELNET",
                        "SMTP",
                        "SNMP"},
//32
                {"Deuxième génération",
                        "Quatrième génération",
                        "Troisième génération",
                        "Tout les réponses sont vrais"},
//33
                {"2",
                        "10",
                        "8",
                        "16"},
//34
                {"SRAM",
                        "DRAM",
                        "ROM",
                        "Tout les réponses sont vrais"},
//35
                {"OS-2",
                        "Windows",
                        "DOS",
                        "UNIX"},
//36
                {"allouer dynamiquement",
                        "attribuer automatiquement",
                        "allouer statiquement",
                        "Tout les réponses sont vrais"},
//37
                {"registres",
                        "accumulateurs",
                        "ensemble de lignes parallèles",
                        "horloge d’ordinateur"},
//38
                {"Porte à piège",
                        "Cheval de Troie",
                        "Virus",
                        "Ver"},
//39
                {"Cheval de Troie",
                        "Virus",
                        "Ver",
                        "Zombie"},
//40
                {"POP",
                        "PGP",
                        "SNMP",
                        "HTTP"},
        };
        return answers;
    }
    public String[][] WindowsRoads(){
        String[][] answers = {


//1
                {"Un réseau virtuel privé",
                        "Une méthode d'authentification",
                        "Un service d'annuaire",
                        "Aucune de ces réponses"},
//2
                {"Fdisk",
                        "Chkdsk",
                        "More",
                        "Aucune de ces réponses"},
//3
                {"Cette commande permet de lister les interfaces réseau du nœud actif. ",
                        "Cette commande permet de transformer une partition FAT ou FAT32 en NTFS. ",
                        "Cette commande permet d'afficher la table de routage. ",
                        "Aucune de ces réponses"},
//4
                {" PPTP",
                        "OpenVPN",
                        "SSL",
                        "Aucune de ces réponses"},
//5
                {"Il permet de convertir un système de fichier FAT32 en NTFS.",
                        " Il permet de convertir un système de fichier FAT16 en FAT32.",
                        "Il permet de convertir un système de fichier NTFS en FAT16.",
                        "Aucune de ces réponses"},
//6
                {"SSL",
                        "LDAP",
                        "Kerberos",
                        "Aucune de ces réponses"},
//7
                {"Les fichiers seront copiés mais ne conserveront pas leur état crypté dans le dossier de destination.",
                        "   Les fichiers seront copiés et conserveront leur état crypté dans le dossier de destination.",
                        "   Il faut d'abord décrypter les fichiers NTFS avant de les copier sur le volume FAT.",
                        "   Aucune de ces réponses"},
//8
                {"FTP, SMTP, HTTP",
                        "FTP, SSH, HTTP",
                        "HTTP, SNMP, FTP",
                        "-----"},
//9
                {"Tracert",
                        "Ping",
                        "Netstat",
                        "Les trois"},
//10
                {"Windows XP",
                        "Windows 7",
                        "Windows Embedded",
                        "Les trois"},
//11
                {"Je clique sur un élément, puis je déplace la souris en maintenant le doigt enfoncé sur le bouton",
                        "Je clique sur un élément avec le bouton droit de la souris, et je choisis 'Envoyer vers' dans le menu contextuel",
                        "Je maintiens la touche Ctrl enfoncée, et je clique sur plusieurs éléments",
                        "Je laisse enfoncé le bouton gauche de la souris, et je trace un cadre"},
//12
                {"La zone de notification",
                        "La barre des tâches",
                        "La barre de lancement rapide",
                        "La barre des outils"},
//13
                {"L'ouvrir en un éclair d'un double clic",
                        "Le décompresser",
                        "Le passer à l'antivirus",
                        "Le récupérer dans la corbeille"},
//14
                {"A ouvrir le menu Favoris",
                        "A accéder directement au Bureau",
                        "A effectuer des raccourcis clavier propres à Windows",
                        "A afficher l'aide de Windows"},
//15
                {"Windows et les pilotes du matériel",
                        "Windows, les pilotes du matériel et Internet Explorer",
                        "Windows, les pilotes du matériel et les logiciels Microsoft installés",
                        "Windows, les pilotes du matériel et les logiciels installés"},
//16
                {"Echap",
                        "Ctrl+Alt+Suppr",
                        "F8",
                        "H+e+l+p"},
//17
                {"La réouverture automatique au démarrage de Windows des fenêtres de dossiers ouvertes lors de l'arrêt du PC",
                        "L'affichage des extensions de fichiers",
                        "L'ouverture des éléments par simple clic",
                        "Le changement de l'icône par défaut des dossiers"},
//18
                {
                        "est une option d'installation utilisée pour Windows",
                        "un outil en ligne de commande qui exporte ou importe des objets Active Directory",
                        " un service qui résout les noms de domaine",
                        "une technologie d'affectation d'adresses ",

                },
//19
                {"Une sauvegarde automatique du dossier 'Mes documents'",
                        "Un enregistrement des fichiers système et programme à un moment précis",
                        "Une copie temporaire d'un document en cours d'utilisation",
                        "Une réinstallation complète de Windows"},
//20
                {"Elle n'est pas sensible aux coupures électriques",
                        "Elle permet un redémarrage rapide",
                        "Elle permet un arrêt plus rapide",
                        "Elle consomme beaucoup moins d'énergie"},
//21
                {"Zone de notification",
                        "Zone de contrôle",
                        "Zone des processus actifs",
                        "Barre des tâches"},
//22
                {"Ctrl + alt + suppr",
                        "Windows + E",
                        "Clic droit",
                        "ALT + F4"},
//23
                {"Ctrl + alt + suppr",
                        "Windows + E",
                        "Clic molette",
                        "ALT + F4"},
//24
                {"À restaurer tous les documents perdus",
                        "À restaurer des fichiers du système",
                        "À restaurer les paramètres d'un logiciel",
                        "------"},
//25
                {"Un service",
                        "Une application",
                        "Un fichier de configuration",
                        "Une base de données"},
//26
                {"Registre",
                        "Register",
                        "Regedit",
                        "Cmd"},
//27
                {"Conf",
                        "Control",
                        "Config",
                        "Controler"},
//28
                {"Inv",
                        "Command",
                        "Ddos",
                        "Cmd"},
//29
                {"Un rôle",
                        "Un composant de sécurité",
                        "Une fonctionnalité",
                        "Une application"},
//30
                {"Elle permet un arrêt plus rapide",
                        "Permettre à un utilisateur d'effectuer des tâches en tant qu'administrateur",
                        "De surveiller l'utilisateur",
                        "-------"},
//31
                {"L'identifiant d'une machine dans un réseau",
                        "L'identifiant du bios",
                        "Un service réseau",
                        "Un serveur sur le net"},
//32
                {"comme un réseau SAN",
                        "un stockage qui est principalement connecté physiquement au serveur.",
                        "un stockage connecté à un périphérique de stockage dédié et accessible via un réseau.",
                        "----"},
//33
                {"Par la commande ping",
                        "Par les menus contextuels",
                        "Avec la commande hostname",
                        "Avec la commande shutdown"},
//34
                {"Les adresses sont impossibles à changer",
                        "Les adresses dynamiques sont distribuées par un serveur DHCP",
                        "Les adresses sont renouvelées toutes les minutes",
                        "-----"},
//35
                {"2",
                        "3",
                        "4",
                        "5"},
//36
                {"16",
                        "24",
                        "32",
                        "40"},
//37
                {"Stgrlo.msc",
                        "Gpedit.msc",
                        "Stgroupe.msc",
                        "Gplocaledit.msc"},
//38
                {"Packet",
                        "Tracert",
                        "Pong",
                        "----"},
                //39
                {"IMP",
                        "ICMP",
                        "OSPF",
                        "RIP"},
//40
                {"Nslookup",
                        "Dnslookup",
                        "Host",
                        "Dnshost"},
        };
        return answers;
    }
    public String[][] UnixRoads(){
        String[][] answers = {


//1
                {"Man",
                        "Help",
                        "Sos",
                        "Manual"},
//2
                {"CTRL + C",
                        "Copy",
                        "Copie",
                        "Cp"},
//2.1
                {"# enable eth0 up",
                        "# active eth0 up",
                        "# ifconfig eth0 up",
                        "# start eth0 up"},
//3
                {"Rename",
                        "Rn",
                        "Ren",
                        "Rname"},
//4
                {"Chmod",
                        "Ls",
                        "Su",
                        "Top"},
//5
                {"Uname",
                        "Man",
                        "Tar",
                        "Mkdir"},
//6
                {"Rm",
                        "Remove",
                        "Del",
                        "Delete"},
//7
                {"Rmdir",
                        "Removedir",
                        "Deldir",
                        "Deletedir"},
//8
                {"Dog",
                        "Pig",
                        "Cat",
                        "Cow"},
//9
                {"Last",
                        "Final",
                        "Head",
                        "Tail"},
//10
                {"Modifie l'horodatage d'un fichier",
                        "Modifie un fichier texte",
                        "Efface un fichier",
                        "Efface un dossier"},
//11
                {"Modifie le nom d'un fichier",
                        "Modifie le propriétaire et le groupe d'un fichier",
                        "Ajoute des droits d'écriture sur un fichier",
                        "Ajoute des droits de lecture et d'exécution sur un fichier"},
//12
                {"Change le nom d'un dossier",
                        "Change le nom de la machine",
                        "Modifie la taille d'un fichier",
                        "Modifie les droits"},
//13
                {"Indique la date",
                        "Indique l'heure",
                        "Affiche les processus actifs",
                        "Affiche les droits d'un fichier"},
//14
                {"Passe en super-utilisateur",
                        "Vide la corbeille",
                        "Monte une partition formatée",
                        "Ne fait rien"},
//15
                {"oui",
                        "non",
                        "----",
                        "----"},
//16
                {"oui",
                        "non",
                        "----",
                        "----"},
//17
                {"oui",
                        "non",
                        "----",
                        "----"},
//18
                {"Symbol",
                        "Lsym",
                        "Ln -s",
                        "Ln -ls"},
//19
                {"Dif",
                        "Compare",
                        "Cmp",
                        "Diff"},
//20
                {"Ifconfig",
                        "Ipconfig",
                        "Ethconfig",
                        "Faconfig"},
//21
                {"Dot Host Configuration Password",
                        "Dynamic Host Configuration Protocol",
                        "Dynamic Host Controller Port",
                        "Data Hot Center Protocol"},
//22
                {"Distribue un suffiixe DNS",
                        "Distribue une IP statique",
                        "Permet d'accéder à Internet",
                        "Distribue une adresse IP, un masque sous-réseau, une passerelle et un DNS"},
//23
                {"8",
                        "4",
                        "2",
                        "3"},
//24
                {"Libisc-dchp",
                        "Chamber-paquet-dhcp",
                        "Isc-dhcp-server",
                        "Db-isc-dhcp"},
//25
                {"Permet de publier et d'afficher des sites sur internet ou intranet",
                        "Permet d'accéder au web",
                        "Permet d'utiliser le World Wide Web",
                        "Permet d'héberger un jeu vidéo"},
//26
                {"80 et 22",
                        "22 et 443",
                        "335 et 80",
                        "443 et 80"},
//27
                {"Héberger plusieurs sites sur le même serveur",
                        "Virtualiser un hôte",
                        "Virtualiser un site web",
                        "Héberger un serveur virtuel"},
//28
                {"SSL et TSL",
                        "OSPF et HDLS",
                        "WPA et WPS",
                        "NSPK et TKIP"},
//29
                {
                        "Permet d'utiliser le protocole IP",
                        "Permet de partager des fichiers entre machines distantes",
                        "Permet d'utiliser le protocole HTTP",
                        "Permet d'utiliser le protocole RADUIS"},
//30
                {"File Tranport Protocol",
                        "File Transfert Protocol",
                        "File Transfert Port",
                        "File Transport Putty"},
//31
                {"Mode anonymous et Mode authentifié",
                        "Mode restreint et Mode authentifié",
                        "Mode bridé et Mode authentifié",
                        "Mode restreint et Mode bridé"},
//32
                {"Permet d'obtenir des droits administrateurs",
                        "Permet de se connecter en tant qu'utilisateur root",
                        "Permet de bloquer l'utilisateur dans son dossier home",
                        "Permet d'installer des paquets"},

//33

                {"Capoeira",
                        "Tango",
                        "Salsa",
                        "Samba"},
//34
                {"Imprimer de Linux vers Windows",
                        "Partager son accès internet",
                        "Partager son écran",
                        "Prendre la main à distance de Linux à Windows"},

//35
                {"Dynamic Name System",
                        "Dynamic Nomination System",
                        "Domain Name Save",
                        "Domain Name System"},

//36
                {"Permet de traduire une adresse logique en un nom de domaine",
                        "Permet de transplanter un système dans un autre système",
                        "Permet de traduire une adresse IP v4 en IP v6",
                        "----"},

//37
                {"Vrai",
                        "Faux",
                        "----",
                        "----"},
//38
                {"Host",
                        "Pig",
                        "Nslookup",
                        "Nsdns"},
//39

//40
                {"Faire une copie des fichiers de configuration",
                        "Reboot le serveur",
                        "Redémarrer le service",
                        "----"},
        };
        return answers;
    }
}
