PGDMP     :                	    z            eabl    10.22    10.22     ?
           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            ?
           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            ?
           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            ?            1259    16401 
   eabl_users    TABLE     ?   CREATE TABLE public.eabl_users (
    first_name character varying(20),
    last_name character varying(20),
    biz_no character varying(20),
    user_id character varying(12) NOT NULL,
    tel_no character varying(10),
    reward_points integer
);
    DROP TABLE public.eabl_users;
       public         postgres    false            ?
          0    16401 
   eabl_users 
   TABLE DATA               c   COPY public.eabl_users (first_name, last_name, biz_no, user_id, tel_no, reward_points) FROM stdin;
    public       postgres    false    196   ?       l
           2606    16405    eabl_users eabl_users_pkey 
   CONSTRAINT     ]   ALTER TABLE ONLY public.eabl_users
    ADD CONSTRAINT eabl_users_pkey PRIMARY KEY (user_id);
 D   ALTER TABLE ONLY public.eabl_users DROP CONSTRAINT eabl_users_pkey;
       public         postgres    false    196            ?
   ?   x?????0E??>ƴ??%upuG?I ?b??ߗj??{sro?x8??????vge?)?XiC 
?????}U7???,/Y+ƽ?3[?~?Y?d?%??{O???P??$W4+??g$Pn??er??d˝r?)ם??G׍-\??|?h??ƣ??(%ݲ??????2?Z     