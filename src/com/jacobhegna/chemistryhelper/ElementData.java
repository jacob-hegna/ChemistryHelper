package com.jacobhegna.chemistryhelper;

public class ElementData {
	class Element {
		public String name;
		public String symbol;
		public int    number;
		public double mass;
		public int    group;
		public int    period;
		
		public Element() {
			
		}
	}
	
	public Element elements[];
	
	public ElementData() {
		
	}
	
	public void init() {
		elements = new Element[118];
		
    	for(int i = 0; i < 118; i++) {
    		elements[i] = new Element();
    		elements[i].name   = "Hydrogen";
        	elements[i].symbol = "H"; 
        	elements[i].number = 1;
        	elements[i].mass   = 1.00794;
        	elements[i].group  = 1;
        	elements[i].period = 1;
    	}
    	
    	elements[0].name   = "Hydrogen";
    	elements[0].symbol = "H"; 
    	elements[0].number = 1;
    	elements[0].mass   = 1.00794;
    	elements[0].group  = 1;
    	elements[0].period = 1;
    	
    	elements[1].name   = "Helium";
    	elements[1].symbol = "He"; 
    	elements[1].number = 2;
    	elements[1].mass   = 4.002602;
    	elements[1].group  = 18;
    	elements[1].period = 1;
    	
    	elements[2].name   = "Lithium";
    	elements[2].symbol = "Li"; 
    	elements[2].number = 3;
    	elements[2].mass   = 6.941;
    	elements[2].group  = 1;
    	elements[2].period = 2;
    	
    	elements[3].name   = "Beryllium";
    	elements[3].symbol = "Be"; 
    	elements[3].number = 4;
    	elements[3].mass   = 9.012182;
    	elements[3].group  = 2;
    	elements[3].period = 2;
    	
    	elements[4].name   = "Boron";
    	elements[4].symbol = "B"; 
    	elements[4].number = 5;
    	elements[4].mass   = 10.811;
    	elements[4].group  = 13;
    	elements[4].period = 2;
    	
    	elements[5].name   = "Carbon";
    	elements[5].symbol = "C"; 
    	elements[5].number = 6;
    	elements[5].mass   = 12.0107;
    	elements[5].group  = 14;
    	elements[5].period = 2;
    	
    	elements[6].name   = "Nitrogen";
    	elements[6].symbol = "N"; 
    	elements[6].number = 7;
    	elements[6].mass   = 14.0067;
    	elements[6].group  = 15;
    	elements[6].period = 2;
    	
    	elements[7].name   = "Oxygen";
    	elements[7].symbol = "O"; 
    	elements[7].number = 8;
    	elements[7].mass   = 15.9994;
    	elements[7].group  = 16;
    	elements[7].period = 2;
    	
    	elements[8].name   = "Fluorine";
    	elements[8].symbol = "F"; 
    	elements[8].number = 9;
    	elements[8].mass   = 18.9984032;
    	elements[8].group  = 17;
    	elements[8].period = 2;
    	
    	elements[9].name   = "Neon";
    	elements[9].symbol = "Ne"; 
    	elements[9].number = 10;
    	elements[9].mass   = 20.1797;
    	elements[9].group  = 18;
    	elements[9].period = 2;
    	
    	elements[10].name   = "Sodium";
    	elements[10].symbol = "Na"; 
    	elements[10].number = 11;
    	elements[10].mass   = 22.98976928;
    	elements[10].group  = 1;
    	elements[10].period = 3;
    	
    	elements[11].name   = "Magnesium";
    	elements[11].symbol = "Mg"; 
    	elements[11].number = 12;
    	elements[11].mass   = 24.3050;
    	elements[11].group  = 2;
    	elements[11].period = 3;
    	
    	elements[12].name   = "Aluminium";
    	elements[12].symbol = "Al"; 
    	elements[12].number = 13;
    	elements[12].mass   = 26.9815386;
    	elements[12].group  = 13;
    	elements[12].period = 3;
    	
    	elements[13].name   = "Silicon";
    	elements[13].symbol = "Si"; 
    	elements[13].number = 14;
    	elements[13].mass   = 28.0855;
    	elements[13].group  = 14;
    	elements[13].period = 3;
    	
    	elements[14].name   = "Phosphorus";
    	elements[14].symbol = "P"; 
    	elements[14].number = 15;
    	elements[14].mass   = 30.973762;
    	elements[14].group  = 15;
    	elements[14].period = 3;
    	
    	elements[15].name   = "Sulfer";
    	elements[15].symbol = "S"; 
    	elements[15].number = 16;
    	elements[15].mass   = 32.065;
    	elements[15].group  = 16;
    	elements[15].period = 3;
    	
    	elements[16].name   = "Chlorine";
    	elements[16].symbol = "Cl"; 
    	elements[16].number = 17;
    	elements[16].mass   = 35.453;
    	elements[16].group  = 17;
    	elements[16].period = 3;
    	
    	elements[17].name   = "Argon";
    	elements[17].symbol = "Ar"; 
    	elements[17].number = 18;
    	elements[17].mass   = 39.948;
    	elements[17].group  = 18;
    	elements[17].period = 3;
    	
    	elements[18].name   = "Potassium";
    	elements[18].symbol = "K"; 
    	elements[18].number = 19;
    	elements[18].mass   = 39.0983;
    	elements[18].group  = 1;
    	elements[18].period = 4;
    	
    	elements[19].name   = "Calcium";
    	elements[19].symbol = "Ca"; 
    	elements[19].number = 20;
    	elements[19].mass   = 40.078;
    	elements[19].group  = 2;
    	elements[19].period = 4;
    	
    	elements[20].name   = "Scadium";
    	elements[20].symbol = "Sc"; 
    	elements[20].number = 21;
    	elements[20].mass   = 44.955912;
    	elements[20].group  = 3;
    	elements[20].period = 4;
    	
    	elements[21].name   = "Titanium";
    	elements[21].symbol = "Ti"; 
    	elements[21].number = 22;
    	elements[21].mass   = 47.867;
    	elements[21].group  = 4;
    	elements[21].period = 4;
    	
    	elements[22].name   = "Vanadium";
    	elements[22].symbol = "V"; 
    	elements[22].number = 23;
    	elements[22].mass   = 50.9415;
    	elements[22].group  = 5;
    	elements[22].period = 4;
    	
    	elements[23].name   = "Chromium";
    	elements[23].symbol = "Cr"; 
    	elements[23].number = 24;
    	elements[23].mass   = 51.9961;
    	elements[23].group  = 6;
    	elements[23].period = 4;
    	
    	elements[24].name   = "Manganese";
    	elements[24].symbol = "Mn"; 
    	elements[24].number = 25;
    	elements[24].mass   = 54.938045;
    	elements[24].group  = 7;
    	elements[24].period = 4;
    	
    	elements[25].name   = "Iron";
    	elements[25].symbol = "Fe"; 
    	elements[25].number = 26;
    	elements[25].mass   = 55.845;
    	elements[25].group  = 8;
    	elements[25].period = 4;
    	
    	elements[26].name   = "Cobalt";
    	elements[26].symbol = "Co"; 
    	elements[26].number = 27;
    	elements[26].mass   = 58.933195;
    	elements[26].group  = 9;
    	elements[26].period = 4;
    	
    	elements[27].name   = "Nickel";
    	elements[27].symbol = "Ni"; 
    	elements[27].number = 28;
    	elements[27].mass   = 58.6934;
    	elements[27].group  = 10;
    	elements[27].period = 4;
    	
    	elements[28].name   = "Copper";
    	elements[28].symbol = "Cu"; 
    	elements[28].number = 29;
    	elements[28].mass   = 63.546;
    	elements[28].group  = 11;
    	elements[28].period = 4;
    	
    	elements[29].name   = "Zinc";
    	elements[29].symbol = "Zn"; 
    	elements[29].number = 30;
    	elements[29].mass   = 65.38;
    	elements[29].group  = 12;
    	elements[29].period = 4;
    	
    	elements[30].name   = "Gallium";
    	elements[30].symbol = "Ga"; 
    	elements[30].number = 31;
    	elements[30].mass   = 69.723;
    	elements[30].group  = 13;
    	elements[30].period = 4;
    	
    	elements[31].name   = "Germanium";
    	elements[31].symbol = "Ge"; 
    	elements[31].number = 32;
    	elements[31].mass   = 72.64;
    	elements[31].group  = 14;
    	elements[31].period = 4;
    	
    	elements[32].name   = "Arsenic";
    	elements[32].symbol = "As"; 
    	elements[32].number = 33;
    	elements[32].mass   = 74.92160;
    	elements[32].group  = 15;
    	elements[32].period = 4;
    	
    	elements[33].name   = "Selenium";
    	elements[33].symbol = "Se"; 
    	elements[33].number = 34;
    	elements[33].mass   = 78.96;
    	elements[33].group  = 16;
    	elements[33].period = 4;
    	
    	elements[34].name   = "Bromine";
    	elements[34].symbol = "Br"; 
    	elements[34].number = 35;
    	elements[34].mass   = 79.904;
    	elements[34].group  = 17;
    	elements[34].period = 4;
    	
    	elements[35].name   = "Krypton";
    	elements[35].symbol = "Kr"; 
    	elements[35].number = 36;
    	elements[35].mass   = 83.798;
    	elements[35].group  = 18;
    	elements[35].period = 4;
    	
    	elements[36].name   = "Rubidium";
    	elements[36].symbol = "Rb"; 
    	elements[36].number = 37;
    	elements[36].mass   = 85.4678;
    	elements[36].group  = 1;
    	elements[36].period = 5;
    	
    	elements[37].name   = "Strontium";
    	elements[37].symbol = "Sr"; 
    	elements[37].number = 38;
    	elements[37].mass   = 87.62;
    	elements[37].group  = 2;
    	elements[37].period = 5;
    	
    	elements[38].name   = "Yttrium";
    	elements[38].symbol = "Y"; 
    	elements[38].number = 39;
    	elements[38].mass   = 88.90585;
    	elements[38].group  = 3;
    	elements[38].period = 5;
    	
    	elements[39].name   = "Zirconium";
    	elements[39].symbol = "Zr"; 
    	elements[39].number = 40;
    	elements[39].mass   = 91.224;
    	elements[39].group  = 4;
    	elements[39].period = 5;
    	
    	elements[40].name   = "Niobium";
    	elements[40].symbol = "Nb"; 
    	elements[40].number = 41;
    	elements[40].mass   = 92.90638;
    	elements[40].group  = 5;
    	elements[40].period = 5;
    	
    	elements[41].name   = "Molybdenum";
    	elements[41].symbol = "Mo"; 
    	elements[41].number = 42;
    	elements[41].mass   = 95.96;
    	elements[41].group  = 6;
    	elements[41].period = 5;

    	elements[42].name   = "Technetium";
    	elements[42].symbol = "Tc"; 
    	elements[42].number = 43;
    	elements[42].mass   = 97.9072;
    	elements[42].group  = 7;
    	elements[42].period = 5;
    	
    	elements[43].name   = "Ruthenium";
    	elements[43].symbol = "Ru"; 
    	elements[43].number = 44;
    	elements[43].mass   = 101.07;
    	elements[43].group  = 8;
    	elements[43].period = 5;
    	
    	elements[44].name   = "Rhodium";
    	elements[44].symbol = "Rh"; 
    	elements[44].number = 45;
    	elements[44].mass   = 102.90550;
    	elements[44].group  = 9;
    	elements[44].period = 5;
    	
    	elements[45].name   = "Palladium";
    	elements[45].symbol = "Pd"; 
    	elements[45].number = 46;
    	elements[45].mass   = 106.42;
    	elements[45].group  = 10;
    	elements[45].period = 5;
    	
    	elements[46].name   = "Silver";
    	elements[46].symbol = "Ag"; 
    	elements[46].number = 47;
    	elements[46].mass   = 107.8682;
    	elements[46].group  = 11;
    	elements[46].period = 5;
    	
    	elements[47].name   = "Cadmium";
    	elements[47].symbol = "Cd"; 
    	elements[47].number = 48;
    	elements[47].mass   = 112.411;
    	elements[47].group  = 12;
    	elements[47].period = 5;
    	
    	elements[48].name   = "Indium";
    	elements[48].symbol = "In"; 
    	elements[48].number = 49;
    	elements[48].mass   = 114.818;
    	elements[48].group  = 13;
    	elements[48].period = 5;
    	
    	elements[49].name   = "Tin";
    	elements[49].symbol = "Sn"; 
    	elements[49].number = 50;
    	elements[49].mass   = 118.710;
    	elements[49].group  = 14;
    	elements[49].period = 5;
    	
    	elements[50].name   = "Antimony";
    	elements[50].symbol = "Sb"; 
    	elements[50].number = 51;
    	elements[50].mass   = 121.760;
    	elements[50].group  = 15;
    	elements[50].period = 5;
    	
    	elements[51].name   = "Tellurium";
    	elements[51].symbol = "Te"; 
    	elements[51].number = 52;
    	elements[51].mass   = 127.60;
    	elements[51].group  = 16;
    	elements[51].period = 5;
    	
    	elements[52].name   = "Iodine";
    	elements[52].symbol = "I"; 
    	elements[52].number = 53;
    	elements[52].mass   = 126.90447;
    	elements[52].group  = 17;
    	elements[52].period = 5;
    	
    	elements[53].name   = "Xenon";
    	elements[53].symbol = "Xe"; 
    	elements[53].number = 54;
    	elements[53].mass   = 131.293;
    	elements[53].group  = 18;
    	elements[53].period = 5;
    	
    	elements[54].name   = "Caesium";
    	elements[54].symbol = "Cs"; 
    	elements[54].number = 55;
    	elements[54].mass   = 132.9054519;
    	elements[54].group  = 1;
    	elements[54].period = 6;
    	
    	elements[55].name   = "Barium";
    	elements[55].symbol = "Ba"; 
    	elements[55].number = 56;
    	elements[55].mass   = 137.327;
    	elements[55].group  = 2;
    	elements[55].period = 6;
    	
    	elements[56].name   = "Lanthanum";
    	elements[56].symbol = "La"; 
    	elements[56].number = 57;
    	elements[56].mass   = 138.90547;
    	elements[56].group  = -1;
    	elements[56].period = 6;
    	
    	elements[57].name   = "Cerium";
    	elements[57].symbol = "Ce"; 
    	elements[57].number = 58;
    	elements[57].mass   = 140.116;
    	elements[57].group  = -1;
    	elements[57].period = 6;
    	
    	elements[58].name   = "Praseodymium";
    	elements[58].symbol = "Pr"; 
    	elements[58].number = 59;
    	elements[58].mass   = 140.90765;
    	elements[58].group  = -1;
    	elements[58].period = 6;
    	
    	elements[59].name   = "Neodymium";
    	elements[59].symbol = "Nd"; 
    	elements[59].number = 60;
    	elements[59].mass   = 144.242;
    	elements[59].group  = -1;
    	elements[59].period = 6;
    	
    	elements[60].name   = "Promethium";
    	elements[60].symbol = "Pm"; 
    	elements[60].number = 61;
    	elements[60].mass   = 145;
    	elements[60].group  = -1;
    	elements[60].period = 6;
    	
    	elements[61].name   = "Samarium";
    	elements[61].symbol = "Sm"; 
    	elements[61].number = 62;
    	elements[61].mass   = 150.36;
    	elements[61].group  = -1;
    	elements[61].period = 6;
    	
    	elements[62].name   = "Europium";
    	elements[62].symbol = "Eu"; 
    	elements[62].number = 63;
    	elements[62].mass   = 151.964;
    	elements[62].group  = -1;
    	elements[62].period = 6;
    	
    	elements[63].name   = "Gadolinium";
    	elements[63].symbol = "Gd"; 
    	elements[63].number = 64;
    	elements[63].mass   = 157.25;
    	elements[63].group  = -1;
    	elements[63].period = 6;
    	
    	elements[64].name   = "Terbium";
    	elements[64].symbol = "Tb"; 
    	elements[64].number = 65;
    	elements[64].mass   = 158.92535;
    	elements[64].group  = -1;
    	elements[64].period = 6;
    	
    	elements[65].name   = "Dysprosium";
    	elements[65].symbol = "Dy"; 
    	elements[65].number = 66;
    	elements[65].mass   = 162.5;
    	elements[65].group  = -1;
    	elements[65].period = 6;
    	
    	elements[66].name   = "Holmium";
    	elements[66].symbol = "Ho"; 
    	elements[66].number = 67;
    	elements[66].mass   = 164.93032;
    	elements[66].group  = -1;
    	elements[66].period = 6;
    	
    	elements[67].name   = "Erbium";
    	elements[67].symbol = "Er"; 
    	elements[67].number = 68;
    	elements[67].mass   = 167.259;
    	elements[67].group  = -1;
    	elements[67].period = 6;
    	
    	elements[68].name   = "Thulium";
    	elements[68].symbol = "Tm"; 
    	elements[68].number = 69;
    	elements[68].mass   = 168.93421;
    	elements[68].group  = -1;
    	elements[68].period = 6;
    	
    	elements[69].name   = "Ytterbium";
    	elements[69].symbol = "Yb"; 
    	elements[69].number = 70;
    	elements[69].mass   = 173.054;
    	elements[69].group  = -1;
    	elements[69].period = 6;
    	
    	elements[70].name   = "Lutetium";
    	elements[70].symbol = "Lu"; 
    	elements[70].number = 71;
    	elements[70].mass   = 174.9668;
    	elements[70].group  = -1;
    	elements[70].period = 6;
    	
    	elements[71].name   = "Hafnium";
    	elements[71].symbol = "Hf"; 
    	elements[71].number = 72;
    	elements[71].mass   = 178.49;
    	elements[71].group  = 4;
    	elements[71].period = 6;
    	
    	elements[72].name   = "Tantalum";
    	elements[72].symbol = "Ta"; 
    	elements[72].number = 73;
    	elements[72].mass   = 180.94788;
    	elements[72].group  = 5;
    	elements[72].period = 6;
    	
    	elements[73].name   = "Tungsten";
    	elements[73].symbol = "W"; 
    	elements[73].number = 74;
    	elements[73].mass   = 183.84;
    	elements[73].group  = 6;
    	elements[73].period = 6;
    	
    	elements[74].name   = "Rhenium";
    	elements[74].symbol = "Re"; 
    	elements[74].number = 75;
    	elements[74].mass   = 186.207;
    	elements[74].group  = 7;
    	elements[74].period = 6;
    	
    	elements[75].name   = "Osmium";
    	elements[75].symbol = "Os"; 
    	elements[75].number = 76;
    	elements[75].mass   = 190.23;
    	elements[75].group  = 8;
    	elements[75].period = 6;
    	
    	elements[76].name   = "Iridum";
    	elements[76].symbol = "Ir"; 
    	elements[76].number = 77;
    	elements[76].mass   = 192.217;
    	elements[76].group  = 9;
    	elements[76].period = 6;
    	
    	elements[77].name   = "Platinum";
    	elements[77].symbol = "Pt"; 
    	elements[77].number = 78;
    	elements[77].mass   = 195.084;
    	elements[77].group  = 10;
    	elements[77].period = 6;
    	
    	elements[78].name   = "Gold";
    	elements[78].symbol = "Au"; 
    	elements[78].number = 79;
    	elements[78].mass   = 196.966569;
    	elements[78].group  = 11;
    	elements[78].period = 6;
    	
    	elements[79].name   = "Mercury";
    	elements[79].symbol = "Hg"; 
    	elements[79].number = 80;
    	elements[79].mass   = 200.59;
    	elements[79].group  = 12;
    	elements[79].period = 6;
    	
    	elements[80].name   = "Thallium";
    	elements[80].symbol = "Tl"; 
    	elements[80].number = 81;
    	elements[80].mass   = 204.3833;
    	elements[80].group  = 13;
    	elements[80].period = 6;
    	
    	elements[81].name   = "Lead";
    	elements[81].symbol = "Pb"; 
    	elements[81].number = 82;
    	elements[81].mass   = 207.2;
    	elements[81].group  = 14;
    	elements[81].period = 6;
    	
    	elements[82].name   = "Bismuth";
    	elements[82].symbol = "Bi"; 
    	elements[82].number = 83;
    	elements[82].mass   = 208.98040;
    	elements[82].group  = 15;
    	elements[82].period = 6;
    	
    	elements[83].name   = "Polonium";
    	elements[83].symbol = "Po"; 
    	elements[83].number = 84;
    	elements[83].mass   = 208.9824;
    	elements[83].group  = 16;
    	elements[83].period = 6;
    	
    	elements[84].name   = "Astatine";
    	elements[84].symbol = "At"; 
    	elements[84].number = 85;
    	elements[84].mass   = 209.9871;
    	elements[84].group  = 17;
    	elements[84].period = 6;
    	
    	elements[85].name   = "Radon";
    	elements[85].symbol = "Rn"; 
    	elements[85].number = 86;
    	elements[85].mass   = 222.0176;
    	elements[85].group  = 18;
    	elements[85].period = 6;
    	
    	elements[86].name   = "Francium";
    	elements[86].symbol = "Fr"; 
    	elements[86].number = 87;
    	elements[86].mass   = 223;
    	elements[86].group  = 1;
    	elements[86].period = 7;
    	
    	elements[87].name   = "Radium";
    	elements[87].symbol = "Ra"; 
    	elements[87].number = 88;
    	elements[87].mass   = 226;
    	elements[87].group  = 2;
    	elements[87].period = 7;
    	
    	elements[88].name   = "Actinium";
    	elements[88].symbol = "Ac"; 
    	elements[88].number = 89;
    	elements[88].mass   = 227;
    	elements[88].group  = -1;
    	elements[88].period = 7;
    	
    	elements[89].name   = "Thorium";
    	elements[89].symbol = "Th"; 
    	elements[89].number = 90;
    	elements[89].mass   = 232.03806;
    	elements[89].group  = -1;
    	elements[89].period = 7;
    	
    	elements[90].name   = "Protactinium";
    	elements[90].symbol = "Pa"; 
    	elements[90].number = 91;
    	elements[90].mass   = 231.03588;
    	elements[90].group  = -1;
    	elements[90].period = 7;
    	
    	elements[91].name   = "Uranium";
    	elements[91].symbol = "U"; 
    	elements[91].number = 92;
    	elements[91].mass   = 238.02891;
    	elements[91].group  = -1;
    	elements[91].period = 7;
    	
    	elements[92].name   = "Neptunium";
    	elements[92].symbol = "Np"; 
    	elements[92].number = 93;
    	elements[92].mass   = 237;
    	elements[92].group  = -1;
    	elements[92].period = 7;
    	
    	elements[93].name   = "Plutonium";
    	elements[93].symbol = "Pu"; 
    	elements[93].number = 94;
    	elements[93].mass   = 244;
    	elements[93].group  = -1;
    	elements[93].period = 7;
    	
    	elements[94].name   = "Americium";
    	elements[94].symbol = "Am"; 
    	elements[94].number = 95;
    	elements[94].mass   = 243;
    	elements[94].group  = -1;
    	elements[94].period = 7;
    	
    	elements[95].name   = "Curium";
    	elements[95].symbol = "Cm"; 
    	elements[95].number = 96;
    	elements[95].mass   = 247;
    	elements[95].group  = -1;
    	elements[95].period = 7;

    	elements[96].name   = "Berkelium";
    	elements[96].symbol = "Bk"; 
    	elements[96].number = 97;
    	elements[96].mass   = 247;
    	elements[96].group  = -1;
    	elements[96].period = 7;
    	
    	elements[97].name   = "Californium";
    	elements[97].symbol = "Cf"; 
    	elements[97].number = 98;
    	elements[97].mass   = 251;
    	elements[97].group  = -1;
    	elements[97].period = 7;
    	
    	elements[98].name   = "Einsteinium";
    	elements[98].symbol = "Es"; 
    	elements[98].number = 99;
    	elements[98].mass   = 252;
    	elements[98].group  = -1;
    	elements[98].period = 7;
    	
    	elements[99].name   = "Fermium";
    	elements[99].symbol = "Fm"; 
    	elements[99].number = 100;
    	elements[99].mass   = 257;
    	elements[99].group  = -1;
    	elements[99].period = 7;
    	
    	elements[100].name   = "Mendelevium";
    	elements[100].symbol = "Md"; 
    	elements[100].number = 101;
    	elements[100].mass   = 258;
    	elements[100].group  = -1;
    	elements[100].period = 7;
    	
    	elements[101].name   = "Nobelium";
    	elements[101].symbol = "No"; 
    	elements[101].number = 102;
    	elements[101].mass   = 259;
    	elements[101].group  = -1;
    	elements[101].period = 7;
    	
    	elements[102].name   = "Lawrencium";
    	elements[102].symbol = "Lr"; 
    	elements[102].number = 103;
    	elements[102].mass   = 262;
    	elements[102].group  = -1;
    	elements[102].period = 7;
    	
    	elements[103].name   = "Rutherfordium";
    	elements[103].symbol = "Rf"; 
    	elements[103].number = 104;
    	elements[103].mass   = 261;
    	elements[103].group  = 4;
    	elements[103].period = 7;
    	
    	elements[104].name   = "Dubnium";
    	elements[104].symbol = "Dd"; 
    	elements[104].number = 105;
    	elements[104].mass   = 262;
    	elements[104].group  = 5;
    	elements[104].period = 7;
    	
    	elements[105].name   = "Seaborgium";
    	elements[105].symbol = "Sg"; 
    	elements[105].number = 106;
    	elements[105].mass   = 266;
    	elements[105].group  = 6;
    	elements[105].period = 7;
    	
    	elements[106].name   = "Bohrium";
    	elements[106].symbol = "Bh"; 
    	elements[106].number = 107;
    	elements[106].mass   = 264;
    	elements[106].group  = 7;
    	elements[106].period = 7;
    	
    	elements[107].name   = "Hassium";
    	elements[107].symbol = "Hs"; 
    	elements[107].number = 108;
    	elements[107].mass   = 277;
    	elements[107].group  = 8;
    	elements[107].period = 7;
    	
    	elements[108].name   = "Meitnerium";
    	elements[108].symbol = "Mt"; 
    	elements[108].number = 109;
    	elements[108].mass   = 268;
    	elements[108].group  = 9;
    	elements[108].period = 7;
    	
    	elements[109].name   = "Darmstadtium";
    	elements[109].symbol = "Ds"; 
    	elements[109].number = 110;
    	elements[109].mass   = 271;
    	elements[109].group  = 10;
    	elements[109].period = 7;
    	
    	elements[110].name   = "Roentgenium";
    	elements[110].symbol = "Rg"; 
    	elements[110].number = 111;
    	elements[110].mass   = 272;
    	elements[110].group  = 11;
    	elements[110].period = 7;
    	
    	elements[111].name   = "Copernicium";
    	elements[111].symbol = "Cn"; 
    	elements[111].number = 112;
    	elements[111].mass   = 285;
    	elements[111].group  = 12;
    	elements[111].period = 7;
    	
    	elements[112].name   = "Ununtrium";
    	elements[112].symbol = "Uut"; 
    	elements[112].number = 113;
    	elements[112].mass   = 284;
    	elements[112].group  = 13;
    	elements[112].period = 7;
    	
    	elements[113].name   = "Flerovium";
    	elements[113].symbol = "Fl"; 
    	elements[113].number = 114;
    	elements[113].mass   = 289;
    	elements[113].group  = 14;
    	elements[113].period = 7;
    	
    	elements[114].name   = "Ununpentium";
    	elements[114].symbol = "Uup"; 
    	elements[114].number = 115;
    	elements[114].mass   = 288;
    	elements[114].group  = 15;
    	elements[114].period = 7;
    	
    	elements[115].name   = "Livermorium";
    	elements[115].symbol = "Lv"; 
    	elements[115].number = 116;
    	elements[115].mass   = 292;
    	elements[115].group  = 16;
    	elements[115].period = 7;
    	
    	elements[116].name   = "Ununseptium";
    	elements[116].symbol = "Uus"; 
    	elements[116].number = 117;
    	elements[116].mass   = 294;
    	elements[116].group  = 17;
    	elements[116].period = 7;
    	
    	elements[117].name   = "Ununoctium";
    	elements[117].symbol = "Uuo"; 
    	elements[117].number = 118;
    	elements[117].mass   = 294;
    	elements[117].group  = 18;
    	elements[117].period = 7;
	}

}