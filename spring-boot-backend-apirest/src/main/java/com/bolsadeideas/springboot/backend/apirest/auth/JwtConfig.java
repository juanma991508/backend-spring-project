package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA="alguna.clave.secreta.1245678";
	public static final String RSA_PRIVADA="-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEowIBAAKCAQEA7KzXaM1VjoVzJdHR3DT+w262zUhfdbMfITNScW+ds7G2kxqG\r\n"
			+ "4nthfN/jeb8Aal7RVouxieOiiNZ90WocQd4CunkbjWFdONBJjdbtIwhYJ0rv/VZL\r\n"
			+ "n7zKReqS/lyMDVz4Bey+HKAEaOeVexcgYiSnsLHa2BRDdjh0E6odWfFZQBzOU0XW\r\n"
			+ "iw7/aCTMcXMdxq3PsF03Vk5MugfIvC4DLBgOH/DPXhUVUH4SBxv060onUGO0pXPM\r\n"
			+ "LGHjl4dYdycoivI2H7bS+bl0mWZb9udfFLkKOhz5SgkhtlIQUrjEamAPt1/D3x82\r\n"
			+ "iNyWhRm7xBrxHtpuUt4dWqJYRhQgFpUNJ+ZCoQIDAQABAoIBAQCeTHS/WidRbhy4\r\n"
			+ "PQB6os+Lc6+82h1PIgE+OY9448i8+a498c4qCZAI7868DW5/tu+ZTVHwAlsh3yTE\r\n"
			+ "Po6r14xHoN020NqDN30a65gsiFY94bdm4KMwMhuwa9bpXokmHvqdK910U+rfJ5Yp\r\n"
			+ "gCxeuFmYqzzOra75kYTB6lQ7ZlvlrpUp8uNO8PeRUapKQvmgUudMujxnfpVoSi/z\r\n"
			+ "C8ZUDaU9pMPb1sHAAOZlUtOQv+d+9CygWMAQR+ayOqXxm7OTnah1yYCW2RyvB8DG\r\n"
			+ "NPQn430wsk13z5qD3E3kgDiosp9V2m3iROwGbRChv76s+ik8co8bwIYQ2S872sVN\r\n"
			+ "BDRNAu3pAoGBAP9sml4vHmL4OSeL+5s+4hjLCvhz0V6Utc9SRSNpAyw3HPmcp1ux\r\n"
			+ "tl28Xl7k/G5891jBdh2n5qqrixSMYuF+Tlr49rtvU37g82FNhgsTWRs4fwCANxow\r\n"
			+ "99Qv/KcFwCRHR42sjEog3+LzjL6rRJz9PRQO1k1mlcgd7+pZmAKx/383AoGBAO01\r\n"
			+ "a0FnWZ18nCNBdFtYwW0Z2dNSOpp/QwuXysD/LXNVwlcx0GpaNlDL9zlI06X69qVh\r\n"
			+ "fTfKpVkTyNLcVO7Iyvws2QcIvE3oLD5clTveYdrGVIY53VKMJUz2ZS6pvfMq46+0\r\n"
			+ "ep1hVadGp1NXUphyU9+kjE30K5X6sV9zRrChhUjnAoGAMsGC/1o/oI0Q1nHzoorh\r\n"
			+ "ZOncGTjyjufgJP2FLZ8teTjOci+V9hufUIsg+ZxpKQ9+G03+SbBWnu2Nqpym/YYa\r\n"
			+ "zesRJHff0KOk2V4NV+AVYdpdKl1QFc1LQgfzHcF/x/W+G0IBcq2Lr86T1kO0U7ni\r\n"
			+ "zDySizjqZKTGSvxYv5hdXAsCgYAZfP3zXymP9I3KdAQOtLDECl0PiexmIXqQylSs\r\n"
			+ "/D5kADkLqXydkOf5MpF0BFFJqnfKOXl8/zdZJPkVPzuZFNZK1n7TdKrXLDVk1gnr\r\n"
			+ "DvAw09LNQXZ4ojp31Jn2s6KHeHpSrO/n7UeI29yq5d0oKFC+3S1+SthMG03n1bko\r\n"
			+ "zZJGzQKBgD4ZzbPC0HlNbDGo++4JnZol+K4fOY1NtHPI1/BUnOn4tb10XpxIw5BZ\r\n"
			+ "TAr97icArPQFhqUvS2T4MhF5jnMpJzlab8RIuwrDCiw8nIGFlqiO0aKaH/S1Qvqp\r\n"
			+ "+O3/SVFrdD3oLCAg08O80HK9VjwGNLVJhKLNIXSI2ts3sibNmKSG\r\n"
			+ "-----END RSA PRIVATE KEY-----";
	public static final String RSA_PUBLICA="-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA7KzXaM1VjoVzJdHR3DT+\r\n"
			+ "w262zUhfdbMfITNScW+ds7G2kxqG4nthfN/jeb8Aal7RVouxieOiiNZ90WocQd4C\r\n"
			+ "unkbjWFdONBJjdbtIwhYJ0rv/VZLn7zKReqS/lyMDVz4Bey+HKAEaOeVexcgYiSn\r\n"
			+ "sLHa2BRDdjh0E6odWfFZQBzOU0XWiw7/aCTMcXMdxq3PsF03Vk5MugfIvC4DLBgO\r\n"
			+ "H/DPXhUVUH4SBxv060onUGO0pXPMLGHjl4dYdycoivI2H7bS+bl0mWZb9udfFLkK\r\n"
			+ "Ohz5SgkhtlIQUrjEamAPt1/D3x82iNyWhRm7xBrxHtpuUt4dWqJYRhQgFpUNJ+ZC\r\n"
			+ "oQIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";

}
